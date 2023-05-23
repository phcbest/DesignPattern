package com.phcbest.designpatterns.behaviorPattern.chainOfResponsibility

import android.content.Context

object ChainOfResponsibilityDemo {
    fun doChainOfResponsibility(context: Context) {
        val dialogUnit1 = DialogUnit1()
        val dialogUnit2 = DialogUnit2()
        val dialogUnit3 = DialogUnit3()
        dialogUnit1.setNextUnit(dialogUnit2)
        dialogUnit2.setNextUnit(dialogUnit3)
        dialogUnit1.handlerRequest(context)
    }
}