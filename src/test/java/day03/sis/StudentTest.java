package day03.sis;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by AidenChoi on 2016. 11. 15..
 */
public class StudentTest {

    @Test
    public void create() {
        final String firstStudentName = "Jane Doe";
        Student student = new Student(firstStudentName);
        assertThat(student.getName(), is(firstStudentName));

        final String secondStudentName = "Joe Blow";
        Student secondStudent = new Student(secondStudentName);
        assertThat(secondStudent.getName(), is(secondStudentName));
    }
}
