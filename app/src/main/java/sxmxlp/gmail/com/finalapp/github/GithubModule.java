package sxmxlp.gmail.com.finalapp.github;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import sxmxlp.gmail.com.finalapp.base.module.BaseNetworkModule;

/**
 * Created by Lee on 2017/6/9.
 */

@Module(includes = BaseNetworkModule.class)
public class GithubModule {
    @Provides
    @Singleton
    public static GithubApi provideGithubApi(Retrofit retrofit) {
        return retrofit.create(GithubApi.class);
    }
}
