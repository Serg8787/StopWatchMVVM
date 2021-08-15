package com.example.stopwatchmvvm

import android.os.Bundle
import android.util.Log
import android.widget.Chronometer
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    lateinit var chronometer: Chronometer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mainViewModel =
            ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.strMutableLiveData.observe(this, Observer {
            tvText.text = it
        })



        btStart.setOnClickListener {
            mainViewModel.start()
        }
        btStop.setOnClickListener {
            mainViewModel.stop()
        }
        btReset.setOnClickListener {
            mainViewModel.reset()

        }




    }
}