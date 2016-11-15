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
    }
}
