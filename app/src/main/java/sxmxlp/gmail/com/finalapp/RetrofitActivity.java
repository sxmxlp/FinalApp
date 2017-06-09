package sxmxlp.gmail.com.finalapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import sxmxlp.gmail.com.finalapp.github.DaggerGithubComponent;
import sxmxlp.gmail.com.finalapp.github.GithubComponent;
import sxmxlp.gmail.com.finalapp.github.GithubService;
import sxmxlp.gmail.com.finalapp.github.model.Contributor;
import sxmxlp.gmail.com.finalapp.network.ApiConstants;
import sxmxlp.gmail.com.finalapp.network.BaseNetworkModule;
import sxmxlp.gmail.com.finalapp.utils.LogUtils;

public class RetrofitActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = RetrofitActivity.class.getSimpleName();

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
        GithubComponent component = DaggerGithubComponent.builder()
                .baseNetworkModule(new BaseNetworkModule(ApiConstants.BASE_URL_GITHUBAPI))
                .build();
        GithubService service = component.service();
        service.api.contributors("square", "retrofit")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<Contributor>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull List<Contributor> contributors) {
                        LogUtils.d(TAG, contributors.toString());
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, RetrofitActivity.class);
        context.startActivity(intent);
    }
}
