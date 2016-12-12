package sis.studentinfo;

import org.junit.Before;
import org.junit.Test;
import sis.studentinfo.Student;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.closeTo;

/**
 * Created by AidenChoi on 2016. 11. 16..
 */
public class StudentTest {
    private static final double GRADE_TOLERANCE = 0.5;
    private static final String STUDENT_NAME = "김제네스";

    private Student student;

    @Before
    public void setUp() {
        student = StudentFactory.create(STUDENT_NAME);
    }

    @Test
    public void create() {
        assertThat(student.getName(), is(STUDENT_NAME));
    }

    @Test
    public void studentStatus() {
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
        assertThat(student.isInState(), is(false));

        student.setState(Student.IN_STATE);
        assertThat(student.isInState(), is(true));

        student.setState("서울");
        assertThat(student.isInState(), is(false));
    }

    @Test
    public void calculateGpa() {
        assertGpa(student.getGpa(), 0);

        student.addGrade(Student.Grade.A);
        assertGpa(student.getGpa(), 4.0);

        student.addGrade(Student.Grade.B);
        assertGpa(student.getGpa(), 3.5);

        student.addGrade(Student.Grade.C);
        assertGpa(student.getGpa(), 3.0);

        student.addGrade(Student.Grade.D);
        assertGpa(student.getGpa(), 2.5);

        student.addGrade(Student.Grade.F);
        assertGpa(student.getGpa(), 2.0);
    }

    private void assertGpa(double origGpa, double expectedGpa) {
        assertThat(origGpa, is(closeTo(expectedGpa, GRADE_TOLERANCE)));
    }
}
