package sis.report;

import org.junit.Test;
import sis.studentinfo.CourseSession;
import sis.studentinfo.Student;
import sis.util.DateUtil;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by AidenChoi on 2016. 11. 20..
 */
public class RosterReporterTest {

    @Test
    public void rosterReport() {
        CourseSession session = new CourseSession("이산수학", "100", new DateUtil().createDate(2016, 1, 4));

        session.enroll(new Student("A"));
        session.enroll(new Student("B"));

        String rosterReport = new RosterReporter(session).getReport();
        System.out.println(rosterReport);
        assertThat(rosterReport, is(
                RosterReporter.ROSTER_REPORT_HEADER +
                        "A" + RosterReporter.NEWLINE +
                        "B" + RosterReporter.NEWLINE +
                        RosterReporter.ROSTER_REPORT_FOOTER + "2" + RosterReporter.NEWLINE)
        );
    }
}
