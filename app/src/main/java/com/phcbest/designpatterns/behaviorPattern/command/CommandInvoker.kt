package com.phcbest.designpatterns.behaviorPattern.command

import android.content.Context

class CommandInvoker(var commandDateImpl: CommandDateImpl, var commandTimeImpl: CommandTimeImpl) {
    fun executeToastDate(context: Context) {
        commandDateImpl.execute(context)
    }

    fun executeToastTime(context: Context) {
        commandTimeImpl.execute(context)
    }
}