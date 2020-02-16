package com.craftmaster2190.droid.familysteps.service

import android.content.Context
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.util.concurrent.TimeUnit

class StepsWorker(appContext: Context, workerParams: WorkerParameters) :
    Worker(appContext, workerParams) {

    override fun doWork(): Result {
        // Do the work here--in this case, upload the images.


        // Indicate whether the task finished successfully with the Result
        return Result.success()
    }

    fun enque() {
        WorkManager.getInstance(this.applicationContext)
            .enqueue(PeriodicWorkRequestBuilder<StepsWorker>(15L, TimeUnit.SECONDS).build())
    }
}
