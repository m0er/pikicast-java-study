package sis.studentinfo;

import org.junit.Before;
import org.junit.Test;
import sis.studentinfo.CourseSession;
import sis.studentinfo.Student;
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
        session = new CourseSession(department, number, startDate);
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

    @Test
    public void count() {
        // 클래스 멤버 변수는 이 클래스를 읽어 들일 때 초기화 하고 관리되기 때문에 초기화 되지 않는다.
        CourseSession.resetCount();
        createCourseSession();
        assertThat(CourseSession.getCount(), is(1));
        createCourseSession();
        assertThat(CourseSession.getCount(), is(2));
    }

    private CourseSession createCourseSession() {
        return new CourseSession("더미 강좌", "101", startDate);
    }
}
