package com.phcbest.designpatterns.createPattern.factory

import android.app.AlertDialog
import android.content.Context

interface IFactory {
    fun getDialog(context:Context): AlertDialog
}