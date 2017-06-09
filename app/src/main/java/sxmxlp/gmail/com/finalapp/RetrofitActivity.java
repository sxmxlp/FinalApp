package sxmxlp.gmail.com.finalapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import sxmxlp.gmail.com.finalapp.github.DaggerGithubComponent;
import sxmxlp.gmail.com.finalapp.github.GithubComponent;
import sxmxlp.gmail.com.finalapp.github.GithubService;
import sxmxlp.gmail.com.finalapp.github.model.Contributor;

public class RetrofitActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        initViews();
    }

    private void initViews() {
        findViewById(R.id.btn_click_retrofit).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_click_retrofit:
                handleClick();
                break;
            default:
                break;
        }
    }

    private void handleClick() {
        GithubComponent component = DaggerGithubComponent.create();
        GithubService service = component.service();
        service.api.contributors("square", "retrofit").enqueue(new Callback<List<Contributor>>() {
            @Override
            public void onResponse(Call<List<Contributor>> call, Response<List<Contributor>> response) {
                List<Contributor> body = response.body();
            }

            @Override
            public void onFailure(Call<List<Contributor>> call, Throwable t) {

            }
        });
    }

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, RetrofitActivity.class);
        context.startActivity(intent);
    }
}
