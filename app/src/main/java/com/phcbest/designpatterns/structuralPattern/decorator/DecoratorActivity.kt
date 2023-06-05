package com.phcbest.designpatterns.structuralPattern.decorator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.phcbest.designpatterns.databinding.ActivityDecoratorBinding

class DecoratorActivity : AppCompatActivity() {
    private val binding by lazy { ActivityDecoratorBinding.inflate(LayoutInflater.from(this)) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        binding.tvEnableDecorator.setOnClickListener(AntiShakeClickDecorator(2000L) {
            Toast.makeText(this, "这个是带2000ms防抖的哦", Toast.LENGTH_SHORT).show()
        })
        binding.tvDisEnableDecorator.setOnClickListener {
            Toast.makeText(this, "这个是不带防抖的哦", Toast.LENGTH_SHORT).show()
        }
    }

    class AntiShakeClickDecorator(
        private val delay: Long = 2000,
        private val onClickListener: View.OnClickListener
    ) : View.OnClickListener {
        private var lastClickTime: Long = 0

        override fun onClick(v: View?) {
            val currentTime = System.currentTimeMillis()
            if (currentTime - lastClickTime > delay) {
                lastClickTime = currentTime
                onClickListener.onClick(v)
            }
        }
    }
}