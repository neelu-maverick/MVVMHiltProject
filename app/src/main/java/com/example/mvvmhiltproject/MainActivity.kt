package com.example.mvvmhiltproject

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.mvvmhiltproject.databinding.ActivityMainBinding
import com.example.mvvmhiltproject.viewmodel.MovieViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val movieViewModel: MovieViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        // setContentView(R.layout.activity_main)

        movieViewModel.getData()
        movieViewModel.movieResponse.observe(this, Observer {
            Log.e("Response : ", "onCreate : $it")
        })
        setContentView(binding.root)
    }

}