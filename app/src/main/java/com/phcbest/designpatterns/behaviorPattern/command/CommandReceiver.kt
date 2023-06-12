package com.phcbest.designpatterns.behaviorPattern.command

import android.content.Context
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class CommandReceiver {
    fun toastTime(context: Context){
        val simpleDateFormat = SimpleDateFormat("HH:mm:ss", Locale.US)
        Toast.makeText(context, simpleDateFormat.format(Date(System.currentTimeMillis())), Toast.LENGTH_SHORT).show()
    }
    fun toastDate(context: Context){
        val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.US)
        val currentDate = System.currentTimeMillis()
        val formattedDate = simpleDateFormat.format(Date(currentDate))
        Toast.makeText(context, formattedDate, Toast.LENGTH_SHORT).show()
    }
}