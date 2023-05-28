package com.phcbest.designpatterns.behaviorPattern.state

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.phcbest.designpatterns.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class StateActivity : AppCompatActivity(), IFragmentState {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_state)
        lifecycleScope.launch(Dispatchers.Default) {
            showLoading()
            delay(3000)
            showFailure()
            delay(3000)
            showLoading()
            delay(3000)
            showSuccess()
        }
    }

    override fun showLoading() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fl_content, StateLoadingFragment())
        transaction.commit()
    }

    override fun showSuccess() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fl_content, StateSuccessFragment())
        transaction.commit()
    }

    override fun showFailure() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fl_content, StateFailureFragment())
        transaction.commit()
    }
}