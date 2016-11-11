package day01;

/**
 * Created by AidenChoi on 2016. 11. 7..
 */
public class PikiView {
    private Presenter presenter;

    private String data;

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    public void requestData() {
        data = presenter.getData();
        showData();
    }

    public String getData() {
        return data;
    }

    public void showData() {
        System.out.println(data);
    }

    public void login() {
        presenter.login("some id");
    }
}
