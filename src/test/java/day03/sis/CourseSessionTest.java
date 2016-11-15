package day03.sis;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * Created by AidenChoi on 2016. 11. 15..
 */
public class CourseSessionTest {
    CourseSession session;

    @Before
    public void setUp() {
        session = new CourseSession("ENGL", "101");
    }

    @Test
    public void create() {
        assertThat(session.getDepartment(), is("ENGL"));
        assertThat(session.getNumber(), is("101"));
        assertThat(session.getNumberOfStudents(), is(0));
    }

    @Test
    public void enroll() {
        Student student1 = new Student("Cain Divoe");
        session.enroll(student1);

        assertThat(session.getNumberOfStudents(), is(1));
        assertThat(session.get(0), is(sameInstance(student1)));

        Student student2 = new Student("Caralee Devaughn");
        session.enroll(student2);

        assertThat(session.getNumberOfStudents(), is(2));
        assertThat(session.get(1), is(sameInstance(student2)));
    }

    @Test
    public void courseDate() {
        int year = 116;
        int month = 0;
        int date = 4;
        Date startDate = new Date(year, month, date);

        CourseSession session = new CourseSession("ABCD", "200", startDate);

        year = 116;
        month = 3;
        date = 22;
        Date sixteenWeeksOut = new Date(year, month, date);
        assertThat(sixteenWeeksOut, is(session.getEndDate()));
    }
}
