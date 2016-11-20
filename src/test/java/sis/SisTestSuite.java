package sis;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import sis.report.RosterReporterTest;
import sis.studentinfo.CourseSessionTest;
import sis.studentinfo.StudentTest;
import sis.util.DateUtilTest;

/**
 * Created by AidenChoi on 2016. 11. 20..
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        StudentTest.class,
        CourseSessionTest.class,
        RosterReporterTest.class,
        DateUtilTest.class
})
public class SisTestSuite {
}
