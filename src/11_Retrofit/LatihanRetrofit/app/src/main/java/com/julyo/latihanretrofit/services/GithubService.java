package com.julyo.latihanretrofit.services;

import com.julyo.latihanretrofit.models.Repo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface GithubService {
    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos (@Path("user") String user);
}
