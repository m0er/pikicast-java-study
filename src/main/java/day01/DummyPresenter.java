package day01;

/**
 * Created by AidenChoi on 2016. 11. 7..
 */
public class DummyPresenter implements Presenter {
    @Override
    public String getData() {
        return "{result: test}";
    }
}
