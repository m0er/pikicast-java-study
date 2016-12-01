package sis.studentinfo;

import org.junit.Test;
import sis.studentinfo.Student;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by AidenChoi on 2016. 11. 16..
 */
public class StudentTest {

    @Test
    public void create() {
        String studentName = "김제네스";
        Student student = new Student(studentName);
        assertThat(student.getName(), is(studentName));
    }

    @Test
    public void studentStatus() {
        Student student = new Student("김제네스");

        assertThat(student.getCredits(), is(0));
        assertThat(student.isFullTime(), is(false));

        student.addCredits(3);
        assertThat(student.isFullTime(), is(false));
        assertThat(student.getCredits(), is(3));

        student.addCredits(4);
        assertThat(student.getCredits(), is(7));
        assertThat(student.isFullTime(), is(false));

        student.addCredits(5);
        assertThat(student.getCredits(), is(12));
        assertThat(student.isFullTime(), is(true));
    }


    @Test
    public void inState() {
        Student student = new Student("이반");
        assertThat(student.isInState(), is(false));

        student.setState(Student.IN_STATE);
        assertThat(student.isInState(), is(true));

        student.setState("서울");
        assertThat(student.isInState(), is(false));
    }
}
