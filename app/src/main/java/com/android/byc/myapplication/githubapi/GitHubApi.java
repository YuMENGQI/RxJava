package com.android.byc.myapplication.githubapi;

import com.android.byc.myapplication.model.Contributor;
import com.android.byc.myapplication.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/31 17:01
 * @description
 */
public interface GitHubApi {

    @GET("/users/{username}")
    Call<User> getUser(@Path("username") String user);

    @GET("/users/{username}")
    Observable<User> getUserObservable(@Path("username") String username);


    /**
     * See https://developer.github.com/v3/repos/#list-contributors
     */
    @GET("/repos/{owner}/{repo}/contributors")
    Observable<List<Contributor>> getContributorsObservable(@Path("owner") String owner, @Path("repo") String repo);

    @GET("/repos/{owner}/{repo}/contributors")
    List<Contributor> getContributors(@Path("owner") String owner, @Path("repo") String repo);

}
