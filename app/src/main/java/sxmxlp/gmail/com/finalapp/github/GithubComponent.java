package sxmxlp.gmail.com.finalapp.network;

import dagger.Component;

/**
 * Created by Lee on 2017/6/9.
 */
@Component(modules = {BaseNetworkModule.class, GithubApi.class})
public interface GithubComponent {
    GithubService service();
}
