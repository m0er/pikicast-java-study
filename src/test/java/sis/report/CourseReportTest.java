package sis.report;

import org.junit.Test;
import sis.studentinfo.CourseSession;

import java.util.Date;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;
import static sis.report.ReportConstant.NEWLINE;

/**
 * Created by AidenChoi on 2016. 12. 8..
 */
public class CourseReportTest {

    @Test
    public void report() {
        final Date date = new Date();
        CourseReport report = new CourseReport();
        report.add(CourseSession.create("이산수학", "200", date));
        report.add(CourseSession.create("대학영어", "101", date));
        report.add(CourseSession.create("대학영어", "100", date));
        report.add(CourseSession.create("C 프로그래밍", "411", date));
        report.add(CourseSession.create("C 프로그래밍", "401", date));

        assertThat(report.text(), is(
                "C 프로그래밍 401" + NEWLINE +
                        "C 프로그래밍 411" + NEWLINE +
                        "대학영어 100" + NEWLINE +
                        "대학영어 101" + NEWLINE +
                        "이산수학 200" + NEWLINE));
    }
}
