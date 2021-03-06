package sxmxlp.gmail.com.finalapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import dagger.android.AndroidInjection;

public class DaggerActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);
        initViews();
    }

    private void initViews() {
        findViewById(R.id.btn_click).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_click:
                handleClick();
                break;
            default:
                break;
        }
    }

    private void handleClick() {
    }

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, DaggerActivity.class);
        context.startActivity(intent);
    }
}
