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

    @Before
    public void setUp() {
        session = CourseSession.create(department, number, startDate);
    }

    @Test
    public void create() {
        assertThat(session.getDepartment(), is(department));
        assertThat(session.getNumber(), is(number));
    }

    @Test
    public void enroll() {
        Student student1 = new Student("학생1");
        session.enroll(student1);

        assertThat(session.getStudent(1), is(student1));
        assertThat(session.getStudentCount(), is(1));
        assertThat(student1.getCredits(), is(session.getCredits()));

        Student student2 = new Student("학생2");
        session.enroll(student2);

        assertThat(session.getStudent(2), is(student2));
        assertThat(session.getStudentCount(), is(2));
        assertThat(student2.getCredits(), is(session.getCredits()));
    }

    @Test
    public void studentStatus() {
        Student student = new Student("학생");

        CourseSession session1 = CourseSession.create(department, number, startDate);
        CourseSession session2 = CourseSession.create(department, number, startDate);
        CourseSession session3 = CourseSession.create(department, number, startDate);
        CourseSession session4 = CourseSession.create(department, number, startDate);

        assertThat(student.isFullTime(), is(false));

        session1.enroll(student);
        session2.enroll(student);
        session3.enroll(student);
        session4.enroll(student);

        assertThat(student.isFullTime(), is(true));
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
