package day01;

import org.junit.*;
import util.Logger;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by AidenChoi on 2016. 11. 7..
 */
public class LearningTest {
    private static Logger logger;

    private Learning learning;

    @BeforeClass
    public static void beforeClass() {
        logger = new Logger();
    }

    @Before
    public void setUp() {
        learning = new Learning();
    }

    @Test
    public void 일_더하기_일은_이다() {
        assertThat(learning.plus(1, 1), is(2));
    }

    @Test
    public void 일_더하기_사는_오다() {
        assertThat(learning.plus(1, 4), is(5));
    }

    @After
    public void tearDown() {
        learning = null;
    }

    @AfterClass
    public static void afterClass() {

    }
}
