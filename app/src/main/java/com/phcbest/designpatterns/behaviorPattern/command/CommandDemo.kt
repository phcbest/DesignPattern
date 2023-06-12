package com.phcbest.designpatterns.behaviorPattern.command

import android.content.Context

object CommandDemo {
    fun doDemo(context: Context){
        val commandReceiver = CommandReceiver()
        val commandTimeImpl = CommandTimeImpl(commandReceiver)
        val commandDateImpl = CommandDateImpl(commandReceiver)
        val commandInvoker = CommandInvoker(commandDateImpl, commandTimeImpl)
        commandInvoker.executeToastDate(context)
        commandInvoker.executeToastTime(context)
    }
}