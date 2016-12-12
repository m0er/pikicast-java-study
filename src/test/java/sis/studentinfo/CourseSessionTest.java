package sis.studentinfo;

import org.junit.Before;
import org.junit.Test;
import sis.util.DateUtil;

import java.util.Date;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by AidenChoi on 2016. 11. 16..
 */
public class CourseSessionTest {
    private CourseSession session;
    private String department = "이산수학";
    private String number = "100";
    private Date startDate = DateUtil.createDate(2016, 1, 4);
    private Student student1, student2;

    @Before
    public void setUp() {
        session = CourseSession.create(department, number, startDate);
        student1 = StudentFactory.create("학생1");
        student2 = StudentFactory.create("학생2");
    }

    @Test
    public void create() {
        assertThat(session.getDepartment(), is(department));
        assertThat(session.getNumber(), is(number));
    }

    @Test
    public void enroll() {
        session.enroll(student1);

        assertThat(session.getStudent(1), is(student1));
        assertThat(session.getStudentCount(), is(1));
        assertThat(student1.getCredits(), is(session.getCredits()));

        session.enroll(student2);

        assertThat(session.getStudent(2), is(student2));
        assertThat(session.getStudentCount(), is(2));
        assertThat(student2.getCredits(), is(session.getCredits()));
    }

    @Test
    public void studentStatus() {
        CourseSession session1 = CourseSession.create(department, number, startDate);
        CourseSession session2 = CourseSession.create(department, number, startDate);
        CourseSession session3 = CourseSession.create(department, number, startDate);
        CourseSession session4 = CourseSession.create(department, number, startDate);

        assertThat(student1.isFullTime(), is(false));

        session1.enroll(student1);
        session2.enroll(student1);
        session3.enroll(student1);
        session4.enroll(student1);

        assertThat(student1.isFullTime(), is(true));
    }

    @Test
    public void count() {
        CourseSession.clearSessionCount();
        assertThat(CourseSession.getCourseSessionCount(), is(0));
        CourseSession.create(department, number, startDate);
        assertThat(CourseSession.getCourseSessionCount(), is(1));
    }

    @Test
    public void sort() {
        Date date = new Date();
        CourseSession sessionA = CourseSession.create("A", "101", date);
        CourseSession sessionB = CourseSession.create("B", "101", date);

        assertThat(sessionA.compareTo(sessionB), is(-1));
        assertThat(sessionA.compareTo(sessionA), is(0));
        assertThat(sessionB.compareTo(sessionA), is(1));
    }
}
