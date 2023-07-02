package com.example.mvvmhiltproject.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmhiltproject.model.MovieModel
import com.example.mvvmhiltproject.repository.MovieRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieViewModel @Inject constructor(
    private val movieRepository: MovieRepository
) :
    ViewModel() {

    private val _movieResponse = MutableLiveData<MovieModel>()

    val movieResponse: LiveData<MovieModel>
        get() = _movieResponse

    fun getData(){
        viewModelScope.launch {
           _movieResponse.postValue(movieRepository.getMovieList())
        }
    }

}
