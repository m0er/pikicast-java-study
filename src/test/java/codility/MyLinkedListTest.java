package codility;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * Created by AidenChoi on 2016. 12. 4..
 */
public class MyLinkedListTest {
    MyLinkedList linkedList;

    @Test
    public void case1() {
        int[] examples1 = new int[] {1, 4, -1, 3, 2};
        linkedList = new MyLinkedList(examples1);
        assertThat(linkedList.size(), is(4));
    }
}
