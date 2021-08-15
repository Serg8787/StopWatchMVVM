package com.example.stopwatchmvvm

import android.os.SystemClock
import android.widget.Chronometer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.text.SimpleDateFormat
import java.util.*

class MainViewModel : ViewModel() {

    var count = 0
    val timer = Timer()

    val strMutableLiveData = MutableLiveData<String>()

    fun start() {
        val task = object : TimerTask() {
            override fun run() {
                strMutableLiveData.postValue("00:${count}")
                count++
            }
        }
        timer.scheduleAtFixedRate(task, 0, 1000)
    }

    fun stop() {
        timer.cancel()

    }

    fun reset() {
        strMutableLiveData.value = "reset"
    }


//    chronometer.base = SystemClock.elapsedRealtime()
//    chronometer.start()


}