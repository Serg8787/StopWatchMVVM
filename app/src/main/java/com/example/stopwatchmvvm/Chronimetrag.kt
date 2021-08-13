package com.example.stopwatchmvvm

import android.os.SystemClock
import android.widget.Chronometer

class Chronimetrag {
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