package sxmxlp.gmail.com.finalapp.mvp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import sxmxlp.gmail.com.finalapp.R;
import sxmxlp.gmail.com.finalapp.utils.ActivityUtils;

public class MvpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);
        init();
    }

    private void init() {
        MvpActivityFragment fragment = (MvpActivityFragment) getSupportFragmentManager()
                .findFragmentByTag(MvpActivityFragment.class.getSimpleName());
        if (fragment == null) {
            fragment = new MvpActivityFragment();
        }

        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), fragment, R.id.frame_container);
        UserPresenter userPresenter = new UserPresenter(fragment, new UserModel());
    }

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, MvpActivity.class);
        context.startActivity(intent);
    }
}
