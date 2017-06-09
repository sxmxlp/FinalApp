package sxmxlp.gmail.com.finalapp.network;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Lee on 2017/6/9.
 */

public interface GithubApi {
    @GET("repos/{owner}/{repo}/contributors")
    Call<List<Contributor>> contributors(
            @Path("owner") String owner,
            @Path("repo") String repo);
}
