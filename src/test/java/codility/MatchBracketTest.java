package codility;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

/**
 * Created by AidenChoi on 2016. 12. 4..
 */
public class MatchBracketTest {
    MatchBracket matchBracket;

    @Before
    public void setUp() {
        matchBracket = new MatchBracket();
    }

    @Test
    public void case1() {
        int result = matchBracket.check("(())))(");
        assertThat(result, is(4));
    }
}
