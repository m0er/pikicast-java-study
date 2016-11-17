package sis;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

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
}
