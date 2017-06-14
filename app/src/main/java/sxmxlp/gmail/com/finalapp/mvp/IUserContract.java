package sxmxlp.gmail.com.finalapp.mvp;

import sxmxlp.gmail.com.finalapp.mvp.bean.UserBean;

/**
 * Created by Lee on 2017/6/14.
 */

public interface IUserContract {
    interface IView extends IBaseView<IPresenter> {
        UserBean buildUser();

        void populateUser(UserBean user);

        void showSucceed();

        void showFailed();
    }

    interface IPresenter extends IBasePresenter {
        void saveUser();

        void queryUser();
    }
}
