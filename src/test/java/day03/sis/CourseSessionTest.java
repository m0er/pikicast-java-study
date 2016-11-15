package day03.sis;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

/**
 * Created by AidenChoi on 2016. 11. 15..
 */
public class CourseSessionTest {

    @Test
    public void create() {
        CourseSession courseSession = new CourseSession("ENGL", "101");
        assertThat(courseSession.getDepartment(), is("ENGL"));
        assertThat(courseSession.getNumber(), is("101"));
        assertThat(courseSession.getNumberOfStudents(), is(0));

        Student student1 = new Student("Cain Divoe");
        courseSession.enroll(student1);
        assertThat(courseSession.getNumberOfStudents(), is(1));

        Student student2 = new Student("Caralee Devaughn");
        courseSession.enroll(student2);
        assertThat(courseSession.getNumberOfStudents(), is(2));
    }
}
