package net.cleanhacker.kotlinwithjunitdemo;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface GitHubService {
    @GET("users/{user}")
    Observable<User> get(@Path("user") String user);
}