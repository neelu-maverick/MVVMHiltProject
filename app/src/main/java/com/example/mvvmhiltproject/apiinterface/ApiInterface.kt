package com.example.mvvmhiltproject.apiinterface

import com.example.mvvmhiltproject.model.MovieModel
import retrofit2.http.GET

interface ApiInterface {

    @GET("demos/marvel/")
    suspend fun getMovieList(): MovieModel
}
