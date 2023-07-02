package com.example.mvvmhiltproject.utilities

import com.example.mvvmhiltproject.apiinterface.ApiInterface
import com.example.mvvmhiltproject.repository.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class UtilityModule {

    @Singleton
    @Provides
    fun getModule(apiInterface: ApiInterface): MovieRepository {
        return MovieRepository(apiInterface)
    }
}