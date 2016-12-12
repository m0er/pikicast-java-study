package sis.report;

import org.junit.Before;
import org.junit.Test;
import sis.report.RosterReporter;
import sis.studentinfo.Student;
import sis.studentinfo.StudentFactory;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by AidenChoi on 2016. 11. 22..
 */
public class RosterReporterTest {

    @Test
    public void rosterReport() {
        RosterReporter rosterReporter = new RosterReporter(Arrays.asList(StudentFactory.create("A"), StudentFactory.create("B")));
        String rosterReport = rosterReporter.getRosterReport();
        assertThat(rosterReport, is(
                RosterReporter.ROSTER_REPORT_HEADER +
                "A" + RosterReporter.SEPARATOR +
                "B" + RosterReporter.SEPARATOR +
                RosterReporter.ROSTER_REPORT_FOOTER + "2" + RosterReporter.SEPARATOR)
        );
    }
}
