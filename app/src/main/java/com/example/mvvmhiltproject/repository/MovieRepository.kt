package com.example.mvvmhiltproject.repository

import com.example.mvvmhiltproject.apiinterface.ApiInterface
import javax.inject.Inject

class MovieRepository @Inject constructor(
    private val apiInterface: ApiInterface
)
 {
    suspend fun getMovieList() = apiInterface.getMovieList()
}
