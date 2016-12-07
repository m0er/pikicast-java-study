package sis.report;

import org.junit.Test;
import sis.studentinfo.CourseSession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;
import static sis.report.ReportConstant.NEWLINE;

/**
 * Created by AidenChoi on 2016. 12. 7..
 */
public class CourseReportTest {

    @Test
    public void report() {
        final Date date = new Date();
        CourseReport report = new CourseReport();
        report.add(CourseSession.create("이산수학", "200", date));
        report.add(CourseSession.create("대학영어", "101", date));
        report.add(CourseSession.create("C 프로그래밍", "401", date));
        report.add(CourseSession.create("이산수학", "220", date));
        report.add(CourseSession.create("C 프로그래밍", "330", date));

        assertThat(report.text(), is(
                "C 프로그래밍 330" + NEWLINE +
                "C 프로그래밍 401" + NEWLINE +
                "대학영어 101" + NEWLINE +
                "이산수학 200" + NEWLINE +
                "이산수학 220" + NEWLINE));
    }

    @Test
    public void sortStringsInPlace() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Heller");
        list.add("Kafka");
        list.add("Camus");
        list.add("Boyle");

        ArrayList<String> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);

        assertThat(list.get(0), is("Heller"));
        assertThat(list.get(1), is("Kafka"));
        assertThat(list.get(2), is("Camus"));
        assertThat(list.get(3), is("Boyle"));

        assertThat(sortedList.get(0), is("Boyle"));
        assertThat(sortedList.get(1), is("Camus"));
        assertThat(sortedList.get(2), is("Heller"));
        assertThat(sortedList.get(3), is("Kafka"));
    }

    @Test
    public void stringCompareTo() {
        assertThat("A".compareTo("B"), is(-1));
        assertThat("A".compareTo("A"), is(0));
        assertThat("B".compareTo("A"), is(1));
    }
}
