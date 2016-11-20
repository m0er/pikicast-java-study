package sis;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

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
