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
    public void sortStringsInPlace() {
        List<String> list = new ArrayList<>();
        list.add("Heller");
        list.add("Kafka");
        list.add("Camus");
        list.add("Boyle");

        List<String> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);

        assertThat(list.get(0), is("Heller"));
        assertThat(list.get(1), is("Kafka"));
        assertThat(list.get(2), is("Camus"));
        assertThat(list.get(3), is("Boyle"));

        assertThat(sortedList.get(0), is("Boyle"));
        assertThat(sortedList.get(1), is("Camus"));
        assertThat(sortedList.get(2), is("Heller"));
        assertThat(sortedList.get(3), is("Kafka"));
    }

    @Test
    public void stringCompareTo() {
        assertThat("A".compareTo("B"), is(-1));
        assertThat("A".compareTo("A"), is(0));
        assertThat("B".compareTo("A"), is(1));
    }

    @Test
    public void floatingPointAlwaysApproximation() {
        assertThat(3 * 0.3, is(not(0.9)));
    }

}
