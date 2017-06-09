package sxmxlp.gmail.com.finalapp.network;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by Lee on 2017/6/9.
 */

@Module
public class GithubModule {
    @Provides
    @Singleton
    public static GithubApi provideGithubServie(Retrofit retrofit) {
        return retrofit.create(GithubApi.class);
    }
}
