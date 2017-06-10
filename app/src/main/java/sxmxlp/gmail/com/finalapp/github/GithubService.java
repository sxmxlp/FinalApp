package sxmxlp.gmail.com.finalapp.github;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Lee on 2017/6/9.
 */
@Singleton
public class GithubService {
    private final GithubApi api;

    @Inject
    public GithubService(GithubApi api) {
        this.api =  api;
    }

    public GithubApi getApi() {
        return api;
    }
}
