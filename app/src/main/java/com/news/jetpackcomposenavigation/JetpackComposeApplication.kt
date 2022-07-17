package com.news.jetpackcomposenavigation

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
public class JetpackComposeApplication :Application(){

    override fun onCreate() {
        super.onCreate()

    }
}