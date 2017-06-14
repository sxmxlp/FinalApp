package sxmxlp.gmail.com.finalapp.mvp;

import sxmxlp.gmail.com.finalapp.mvp.bean.UserBean;

/**
 * Created by Lee on 2017/6/14.
 */

public class UserPresenter implements IUserContract.IPresenter {
    private IUserContract.IView view;
    private IUserModel<UserBean> model;

    public UserPresenter(IUserContract.IView view, IUserModel model) {
        this.view = view;
        this.model = model;
        this.view.setPresenter(this);
    }

    @Override
    public void saveUser() {
        view.showFailed();
        UserBean userBean = view.buildUser();
        model.saveData(userBean);
        view.showSucceed();
    }

    @Override
    public void queryUser() {
        UserBean user = model.getData();
        view.populateUser(user);
    }
}
