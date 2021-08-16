package com.example.stopwatchmvvm

import android.os.CountDownTimer
import android.os.SystemClock
import android.widget.Chronometer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.text.SimpleDateFormat
import java.util.*
import kotlin.concurrent.timerTask

class MainViewModel : ViewModel() {


    var timer: CountDownTimer? = null
    val strMutableLiveData = MutableLiveData<String>()

    init {
        timer = object : CountDownTimer(30000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val maxCounter: Long = 30000
                val diff: Long = maxCounter - millisUntilFinished
                strMutableLiveData.postValue("${diff / 1000}")
            }
            override fun onFinish() {
            }
        }
    }
    fun start(){
        timer?.start()
    }
    fun stop(){
        timer?.cancel()

    }
    fun reset(){
        timer?.cancel()
        strMutableLiveData.postValue("0")
    }

    override fun onCleared() {
        super.onCleared()
        timer?.cancel()
    }
}