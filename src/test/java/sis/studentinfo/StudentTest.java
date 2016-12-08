package sis.studentinfo;

import org.junit.Test;
import sis.studentinfo.Student;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.closeTo;

/**
 * Created by AidenChoi on 2016. 11. 16..
 */
public class StudentTest {
    private static final double GRADE_TOLERANCE = 0.05;

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

    @Test
    public void calculateGpa() {
        Student student = new Student("A");
        assertGpa(student, 0.0);

        student.addGrade("A");
        assertGpa(student, 4.0);

        student.addGrade("B");
        assertGpa(student, 3.5);

        student.addGrade("C");
        assertGpa(student, 3.0);

        student.addGrade("D");
        assertGpa(student, 2.5);

        student.addGrade("F");
        assertGpa(student, 2.0);
    }

    private void assertGpa(Student student, double expectedGpa) {
        assertThat(student.getGpa(), is(closeTo(expectedGpa, GRADE_TOLERANCE)));
    }
}
