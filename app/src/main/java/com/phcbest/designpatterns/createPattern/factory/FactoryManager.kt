package com.phcbest.designpatterns.createPattern.factory

class FactoryManager {
    fun getFactoryInstance(type: Int): IFactory {

        return when (type) {
            1 -> {
                FactoryType1()
            }

            2 -> {
                FactoryType2()
            }

            else -> {
                FactoryType1()
            }
        }
    }
}