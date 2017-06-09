package sxmxlp.gmail.com.finalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import retrofit2.Retrofit;

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
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_dagger:
                DaggerActivity.startActivity(this);
                break;
            case R.id.btn_retrofit:
                RetrofitActivity.startActivity(this);
                break;
            default:
                break;
        }
    }
}
