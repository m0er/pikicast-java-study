package day01;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

/**
 * Created by AidenChoi on 2016. 11. 7..
 */
@RunWith(MockitoJUnitRunner.class)
public class PikiViewTest {

    @Mock
    Presenter presenter;

    String testResult = "{result: test}";
    PikiView pikiView;

    @Before
    public void setUp() {
        pikiView = new PikiView();

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
