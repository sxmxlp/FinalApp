package sxmxlp.gmail.com.finalapp.network;

import java.io.IOException;

import javax.inject.Inject;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import sxmxlp.gmail.com.finalapp.BuildConfig;

/**
 * Created by Lee on 2017/6/9.
 */

public class NetworInterceptor implements Interceptor {

    @Inject
    public NetworInterceptor() {

    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        String applicationId = BuildConfig.APPLICATION_ID;
        String versionName = BuildConfig.VERSION_NAME;
        int versionCode = BuildConfig.VERSION_CODE;

        Request request = chain.request();

        Response response = chain.proceed(request);
        return response;
    }
}
