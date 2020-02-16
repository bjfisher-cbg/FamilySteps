package com.craftmaster2190.droid.familysteps

import android.app.Application
import net.danlew.android.joda.JodaTimeAndroid

class MainApplication() : Application() {
    override fun onCreate() {
        super.onCreate()
        JodaTimeAndroid.init(this);
    }
}