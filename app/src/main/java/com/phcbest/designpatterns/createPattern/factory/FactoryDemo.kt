package com.phcbest.designpatterns.createPattern.factory

import android.content.Context

object FactoryDemo {
    fun doDemo(context: Context) {
        val factoryManager = FactoryManager()
        val f1 = factoryManager.getFactoryInstance(1)
        val f2 = factoryManager.getFactoryInstance(2)
        f1.getDialog(context).show()
        f2.getDialog(context).show()
    }
}