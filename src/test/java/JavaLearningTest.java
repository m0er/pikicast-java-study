import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

/**
 * Created by AidenChoi on 2016. 12. 8..
 */
public class JavaLearningTest {

    @Test
    public void stringSort() {
        List<String> strings = new ArrayList<>();
        strings.add("C");
        strings.add("A");
        strings.add("D");
        strings.add("E");
        strings.add("B");

        Collections.sort(strings);

        assertThat(strings.get(0), is("A"));
        assertThat(strings.get(1), is("B"));
        assertThat(strings.get(2), is("C"));
        assertThat(strings.get(3), is("D"));
        assertThat(strings.get(4), is("E"));
    }

    @Test
    public void stringCompare() {
        assertThat("A".compareTo("B"), is(-1));
        assertThat("A".compareTo("A"), is(0));
        assertThat("B".compareTo("A"), is(1));
    }

}
