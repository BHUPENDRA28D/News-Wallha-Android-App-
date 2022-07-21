package com.example.newsapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    String BASE_URL ="https://newsapi.org/";

    @GET("top-headlines")
    Call<MainNews> getNews(

          @Query("country") String country,
         @Query("pageSize")  int pageSize,
         @Query("apikey") String api
    );

    //Getting news of various ctagory
    @GET("top-headlines")
    Call<MainNews> getCategoryNews(
            @Query("country") String country,
            @Query("category")String category,

            @Query("pageSize")  int pageSize,
            @Query("apikey") String api
    );

}
