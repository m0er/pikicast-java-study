import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by AidenChoi on 2016. 11. 7..
 */
public class MainTest {

    @Test
    public void alwaysTrue() {
        assertThat(Main.alwaysTrue(), is(true));
    }

}
