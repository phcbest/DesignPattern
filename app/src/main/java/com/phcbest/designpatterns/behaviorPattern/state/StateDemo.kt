package com.phcbest.designpatterns.behaviorPattern.state

import android.content.Context
import android.content.Intent

object StateDemo {
    fun startDemo(context: Context) {
        context.startActivity(Intent(context, StateActivity::class.java))
    }
}