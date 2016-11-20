package sis;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * Created by AidenChoi on 2016. 11. 16..
 */
public class CourseSessionTest {
    private CourseSession session;
    private String department = "이산수학";
    private String number = "100";

    @Before
    public void setUp() {
        session = new CourseSession(department, number);
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

        Student student2 = new Student("학생2");
        session.enroll(student2);

        assertThat(session.getStudent(2), is(student2));
        assertThat(session.getStudentCount(), is(2));
    }
}
