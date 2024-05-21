package com.example.authapp;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("api/auth/register")
    Call<Void> register(@Body User user);

    @POST("api/auth/login")
    Call<Void> login(@Body User user);
}
