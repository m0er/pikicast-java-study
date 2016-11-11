package day01;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

/**
 * Created by AidenChoi on 2016. 11. 7..
 */
public class PikiViewTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    Presenter presenter;

    @Captor
    ArgumentCaptor<String> argumentCaptor;

    String testResult = "{result: test}";
    PikiView pikiView;

    @Before
    public void setUp() {
        pikiView = new PikiView();
        pikiView.setPresenter(presenter);
        when(presenter.getData()).thenReturn(testResult);
    }

    @Test
    public void verifyData() {
        pikiView.requestData();

        assertThat(pikiView.getData(), is(testResult));

        verify(presenter, times(1)).getData();
    }

    @Test
    public void login() {
        pikiView.login();

        verify(presenter).login(argumentCaptor.capture());

        assertThat("some id", is(argumentCaptor.getValue()));
    }
}
