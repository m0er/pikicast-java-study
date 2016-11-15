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
        Student student = new Student("Jane Doe");
        String studentName = student.getName();
        assertThat(studentName, is("Jane Doe"));

        Student secondStudent = new Student("Joe Blow");
        String secondStudentName = secondStudent.getName();
        assertThat(secondStudentName, is("Joe Blow"));
    }
}
