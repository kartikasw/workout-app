package com.example.a7_minute_workout

import android.app.Application
import com.example.a7_minute_workout.data.HistoryDatabase

class WorkOutApp: Application() {

    val db: HistoryDatabase by lazy {
        HistoryDatabase.getInstance(this)
    }
}