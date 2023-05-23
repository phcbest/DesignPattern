package com.phcbest.designpatterns.behaviorPattern.chainOfResponsibility

import android.app.AlertDialog
import android.content.Context

class DialogUnit2 : IChainOfResponsibilityHandler {

    private var mNextHandler: IChainOfResponsibilityHandler? = null

    override fun setNextUnit(handler: IChainOfResponsibilityHandler) {
        mNextHandler = handler
    }

    override fun handlerRequest(context: Context) {
        AlertDialog.Builder(context).setTitle("处理器2").setMessage("处理器2")
            .setNegativeButton("处理") { dialog, which ->
                mNextHandler?.handlerRequest(context)
            }.setNeutralButton("取消处理") { dialog, which ->
                return@setNeutralButton
            }.show()
    }


}