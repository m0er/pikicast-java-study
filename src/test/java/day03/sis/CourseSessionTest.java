package day03.sis;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * Created by AidenChoi on 2016. 11. 15..
 */
public class CourseSessionTest {
    CourseSession session;
    Date startDate;

    @Before
    public void setUp() {
        startDate = createDate(2016, 1, 4);
        session = new CourseSession("ENGL", "101", startDate);
    }

    @Test
    public void create() {
        assertThat(session.getDepartment(), is("ENGL"));
        assertThat(session.getNumber(), is("101"));
        assertThat(session.getNumberOfStudents(), is(0));
        assertThat(session.getStartDate(), is(startDate));
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
        Date sixteenWeeksOut = createDate(2016, 4, 22);
        assertThat(sixteenWeeksOut, is(session.getEndDate()));
    }

    Date createDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        return calendar.getTime();
    }
}
