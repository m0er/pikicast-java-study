package day01;

/**
 * Created by AidenChoi on 2016. 11. 7..
 */
public class PikiPresenter implements Presenter {

    @Override
    public String getData() {
        // networking...
        return "{result: production}";
    }

    @Override
    public void login(String id) {

    }
}
