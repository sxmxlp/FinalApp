package sxmxlp.gmail.com.finalapp.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import sxmxlp.gmail.com.finalapp.R;
import sxmxlp.gmail.com.finalapp.mvp.bean.UserBean;

/**
 * A placeholder fragment containing a simple view.
 */
public class MvpActivityFragment extends Fragment implements View.OnClickListener, IUserContract.IView {

    private EditText et_username;
    private EditText et_password;
    private View btn_save;
    private View btn_query;
    private IUserContract.IPresenter mPresenter;

    public MvpActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mvp, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        initListeners();
    }

    private void initListeners() {
        btn_save.setOnClickListener(this);
        btn_query.setOnClickListener(this);
    }

    private void initViews(View view) {
        et_username = (EditText) view.findViewById(R.id.et_username);
        et_password = (EditText) view.findViewById(R.id.et_password);
        btn_save = view.findViewById(R.id.btn_save);
        btn_query = view.findViewById(R.id.btn_query);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_save:
                mPresenter.saveUser();
                break;
            case R.id.btn_query:
                mPresenter.queryUser();
                break;
            default:
                break;
        }
    }


    @Override
    public UserBean buildUser() {
        UserBean user = new UserBean();
        user.username = et_username.getText().toString();
        user.password = et_password.getText().toString();
        return user;
    }

    @Override
    public void populateUser(UserBean user) {
        et_username.setText(user.username);
        et_password.setText(user.password);
    }

    @Override
    public void showSucceed() {
        Toast.makeText(getContext(), "success", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showFailed() {
        Toast.makeText(getContext(), "failed", Toast.LENGTH_LONG).show();
    }

    @Override
    public void setPresenter(IUserContract.IPresenter presenter) {
        mPresenter = presenter;
    }
}
