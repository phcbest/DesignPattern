package com.phcbest.designpatterns.behaviorPattern.command

import android.content.Context

class CommandTimeImpl(private val commandReceiver: CommandReceiver) : Command {
    override fun execute(context: Context) {
        commandReceiver.toastTime(context)
    }
}