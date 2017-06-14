package sxmxlp.gmail.com.finalapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import sxmxlp.gmail.com.finalapp.mvp.MvpActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        findViewById(R.id.btn_dagger).setOnClickListener(this);
        findViewById(R.id.btn_retrofit).setOnClickListener(this);
        findViewById(R.id.btn_mvp).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_dagger:
                DaggerActivity.startActivity(this);
                break;
            case R.id.btn_retrofit:
                RetrofitActivity.startActivity(this);
                break;
            case R.id.btn_mvp:
                MvpActivity.startActivity(this);
                break;
            default:
                break;
        }
    }
}
