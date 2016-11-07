package day01;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

/**
 * Created by AidenChoi on 2016. 11. 7..
 */
public class PikiViewTest {

    private PikiView pikiView;

    @Before
    public void before() {
        pikiView = new PikiView();
    }

    @Test
    public void verifyData() {
        Presenter presenter = mock(Presenter.class);
        String testResult = "{result: test}";
        when(presenter.getData()).thenReturn(testResult);
        pikiView.setPresenter(presenter);
        pikiView.requestData();
        assertThat(pikiView.getData(), is(testResult));

        verify(presenter, times(1)).getData();
    }
}
