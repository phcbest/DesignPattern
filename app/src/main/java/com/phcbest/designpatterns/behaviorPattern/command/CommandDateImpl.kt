package com.phcbest.designpatterns.behaviorPattern.command

import android.content.Context

class CommandDateImpl(private val commandReceiver: CommandReceiver):Command {
    override fun execute(context: Context) {
        commandReceiver.toastDate(context)
    }
}