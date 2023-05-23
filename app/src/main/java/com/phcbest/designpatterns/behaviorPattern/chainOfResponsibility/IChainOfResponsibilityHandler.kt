package com.phcbest.designpatterns.behaviorPattern.chainOfResponsibility

import android.content.Context

interface IChainOfResponsibilityHandler {
    fun setNextUnit(handler: IChainOfResponsibilityHandler)
    fun handlerRequest(context: Context)
}