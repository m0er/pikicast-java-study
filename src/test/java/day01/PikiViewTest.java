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
    private Presenter presenter;
    private String testResult = "{result: test}";

    @Before
    public void setUp() {
        pikiView = new PikiView();

        presenter = mock(Presenter.class);
        when(presenter.getData()).thenReturn(testResult);
    }

    @Test
    public void verifyData() {
        pikiView.setPresenter(presenter);
        pikiView.requestData();

        assertThat(pikiView.getData(), is(testResult));

        verify(presenter, times(1)).getData();
    }
}
