package com.phcbest.designpatterns.behaviorPattern.command

import android.content.Context

interface Command {
    fun execute(context: Context)
}