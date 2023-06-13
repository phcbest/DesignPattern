package com.phcbest.designpatterns.behaviorPattern.command

import android.content.Context
import android.util.Log
import java.util.concurrent.Executor
import java.util.concurrent.Executors

private const val TAG = "CommandDemo"

object CommandDemo {
    fun doDemo(context: Context) {
        val commandReceiver = CommandReceiver()
        val commandTimeImpl = CommandTimeImpl(commandReceiver)
        val commandDateImpl = CommandDateImpl(commandReceiver)
        val commandInvoker = CommandInvoker(commandDateImpl, commandTimeImpl)
        commandInvoker.executeToastDate(context)
        commandInvoker.executeToastTime(context)

        //命令对象本身就完成了具体任务的命令模式
        val executor: Executor = Executors.newSingleThreadExecutor()
        val runnable = Runnable { Log.i(TAG, "do yourself in Runnable") }
        executor.execute(runnable)
        val thread: Thread = object : Thread() {
            override fun run() {
                super.run()
                Log.i(TAG, "do yourself in Thread")
            }
        }
        executor.execute(thread)
    }
}