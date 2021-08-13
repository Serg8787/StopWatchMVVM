package com.example.stopwatchmvvm

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.stopwatchmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  lateinit var binding:ActivityMainBinding
    var mainViewModel = MainViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)
        binding.viewModel = mainViewModel
        binding.executePendingBindings()
    }
}