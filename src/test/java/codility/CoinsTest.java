package codility;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

/**
 * Created by AidenChoi on 2016. 12. 4..
 */
public class CoinsTest {
    Coins coins;

    @Before
    public void setUp() {
        coins = new Coins();
    }

    @Test
    public void case1_예제() {
        assertThat(coins.solution(new int[] {1, 1, 0, 1, 0, 0}), is(4));
    }

    @Test
    public void case2() {
        assertThat(coins.solution(new int[] {1, 1, 1, 1, 0, 1}), is(5));
    }

    @Test
    public void case3() {
        assertThat(coins.solution(new int[] {1, 1, 1, 1, 0, 0}), is(4));
    }

    @Test
    public void case4() {
        assertThat(coins.solution(new int[] {0, 0, 0, 0, 0, 0}), is(4));
    }

    @Test
    public void case5() {
        assertThat(coins.solution(new int[] {1, 1, 1, 1, 1, 1}), is(4));
    }
}
