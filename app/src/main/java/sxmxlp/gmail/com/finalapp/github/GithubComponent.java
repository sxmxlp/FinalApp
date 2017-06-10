package sxmxlp.gmail.com.finalapp.github;

import javax.inject.Singleton;

import dagger.Component;
import sxmxlp.gmail.com.finalapp.base.module.BaseNetworkModule;

/**
 * Created by Lee on 2017/6/9.
 */
@Component(modules = {GithubModule.class})
@Singleton
public interface GithubComponent {
    GithubService service();
}
