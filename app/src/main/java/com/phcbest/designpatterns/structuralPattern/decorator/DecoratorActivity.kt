package com.phcbest.designpatterns.structuralPattern.decorator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.phcbest.designpatterns.R
import com.phcbest.designpatterns.databinding.ActivityDecoratorBinding

class DecoratorActivity : AppCompatActivity() {
    private val binding by lazy { ActivityDecoratorBinding.inflate(LayoutInflater.from(this)) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
    }

    private var dataSet = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    private fun initView() {
    }
}