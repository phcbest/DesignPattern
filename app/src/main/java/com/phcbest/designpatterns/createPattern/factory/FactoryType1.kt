package com.phcbest.designpatterns.createPattern.factory

import android.app.AlertDialog
import android.content.Context

class FactoryType1 : IFactory {
    override fun getDialog(context: Context): AlertDialog {
        return AlertDialog.Builder(context).setTitle("工厂1").setMessage("工厂1")
            .create()
    }
}