package sxmxlp.gmail.com.finalapp.github;

import sxmxlp.gmail.com.finalapp.base.module.BaseNetworkModule;
import sxmxlp.gmail.com.finalapp.base.constant.ApiConstants;
import sxmxlp.gmail.com.finalapp.github.component.GithubComponent;

/**
 * Created by Lee on 2017/6/10.
 */

final public class GithubManager {
    private static GithubManager instance;
    private final GithubService service;

    private GithubManager() {
        this.service = init();
    }

    private GithubService init() {
        GithubComponent component = DaggerGithubComponent.builder()
                .baseNetworkModule(new BaseNetworkModule(ApiConstants.BASE_URL_GITHUBAPI))
                .build();
        return component.service();
    }

    public synchronized static GithubManager getInstance() {
        if (instance == null) {
            instance = new GithubManager();
        }
        return instance;
    }

    public GithubService getService() {
        return service;
    }
}
