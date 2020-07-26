package com.example.getnews.Networking;

import com.example.getnews.HelperClasses.Constants;
import com.example.getnews.Model.HeadlineModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface ApiInterface {
    @GET("/top-headlines")
    Call<List<HeadlineModel>> getHeadlinesApi(
            @Query("country") String country,
            @Query("category") String category,
            @Query("apiKey") String apiKey);
}