package sxmxlp.gmail.com.finalapp.mvp;

import sxmxlp.gmail.com.finalapp.mvp.bean.UserBean;

/**
 * Created by Lee on 2017/6/14.
 */

public class UserModel implements IUserModel<UserBean> {
    @Override
    public UserBean getData() {
        return new UserBean();
    }

    @Override
    public void saveData(UserBean data) {

    }
}
