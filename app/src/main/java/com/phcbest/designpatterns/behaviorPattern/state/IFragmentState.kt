package com.phcbest.designpatterns.behaviorPattern.state

interface IFragmentState {
    fun showLoading()
    fun showSuccess()
    fun showFailure()
}