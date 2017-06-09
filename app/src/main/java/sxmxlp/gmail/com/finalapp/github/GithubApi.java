package sxmxlp.gmail.com.finalapp.github;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import sxmxlp.gmail.com.finalapp.github.model.Contributor;

/**
 * Created by Lee on 2017/6/9.
 */

public interface GithubApi {
    String BASE_URL = "https://api.github.com/";

    @GET("repos/{owner}/{repo}/contributors")
    Observable<List<Contributor>> contributors(
            @Path("owner") String owner,
            @Path("repo") String repo);
}
