package com.news.jetpackcomposenavigation

import android.util.Log
import java.util.logging.Logger
import javax.inject.Inject

class LoggerService @Inject constructor() {
    fun log(message:String){
        Log.d(TAG,message)
    }
}