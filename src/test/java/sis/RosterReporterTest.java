package sis;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

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
        assertThat(rosterReport, is(
                RosterReporter.ROSTER_REPORT_HEADER +
                        "A" + RosterReporter.NEWLINE +
                        "B" + RosterReporter.NEWLINE +
                        RosterReporter.ROSTER_REPORT_FOOTER + "2" + RosterReporter.NEWLINE)
        );
    }
}
