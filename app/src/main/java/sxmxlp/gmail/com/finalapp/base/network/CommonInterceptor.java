package sxmxlp.gmail.com.finalapp.base.network;

import java.io.IOException;

import javax.inject.Inject;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import sxmxlp.gmail.com.finalapp.BuildConfig;

/**
 * Created by Lee on 2017/6/9.
 */

public class CommonInterceptor implements Interceptor {

    @Inject
    public CommonInterceptor() {

    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        String applicationId = BuildConfig.APPLICATION_ID;
        String versionName = BuildConfig.VERSION_NAME;
        int versionCode = BuildConfig.VERSION_CODE;

        Request request = chain.request();
        HttpUrl originalUrl = request.url();
        HttpUrl newUrl = originalUrl.newBuilder()
                .addQueryParameter("applicationId", applicationId)
                .addQueryParameter("versionName", versionName)
                .addQueryParameter("versionCode", String.valueOf(versionCode))
                .build();
        Request newRequest = request.newBuilder().url(newUrl).build();
        return chain.proceed(newRequest);
    }
}
