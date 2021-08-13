package com.example.stopwatchmvvm

import android.os.SystemClock
import android.widget.Chronometer
import androidx.databinding.ObservableField
import java.util.*

class MainViewModel {

    private lateinit var chronometer: Chronometer
  


    fun start(){
        chronometer.base = SystemClock.elapsedRealtime()
        chronometer.start()
    }

    fun stop(){
        chronometer.stop()
    }
    fun reset(){
        chronometer.base = SystemClock.elapsedRealtime()
    }
}