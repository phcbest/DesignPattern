package com.phcbest.designpatterns.createPattern.builder

import android.app.AlertDialog
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import com.phcbest.designpatterns.R

class BuilderDemo {
    companion object {
        fun Builder(): build {
            return BuilderDemo.build()
        }

        fun doDemo(context: Context) {
            BuilderDemo.Builder().with(context).setColor1(Color.RED).setColor2(Color.LTGRAY)
                .setColor3(Color.GREEN).setColor4(Color.BLUE).create().show()
        }

        fun doDemoInline(context: Context) {
            BuilderDemo().show {
                this.context = context
                this.color1 = Color.RED
                this.color2 = Color.LTGRAY
                this.color3 = Color.GREEN
                this.color4 = Color.BLUE
            }
        }
    }


    private lateinit var context: Context
    private var color1: Int = Color.parseColor("#66CCCC")
    private var color2: Int = Color.parseColor("#66CCCC")
    private var color3: Int = Color.parseColor("#66CCCC")
    private var color4: Int = Color.parseColor("#66CCCC")

    class build {
        private var builderDemo = BuilderDemo()

        fun with(context: Context): build {
            builderDemo.context = context
            return this
        }

        fun setColor1(color: Int): build {
            builderDemo.color1 = color
            return this
        }

        fun setColor2(color: Int): build {
            builderDemo.color2 = color
            return this
        }

        fun setColor3(color: Int): build {
            builderDemo.color3 = color
            return this
        }

        fun setColor4(color: Int): build {
            builderDemo.color4 = color
            return this
        }


        fun create(): BuilderDemo {
            return builderDemo
        }
    }

    fun show() {
        //生成一个View,显示在Dialog上
        val paint = Paint()
        val view = object : View(context) {
            override fun onDraw(canvas: Canvas?) {
                super.onDraw(canvas)
                paint.color = color1
                canvas?.drawCircle(100F, this.height / 2F, 100F, paint)
                canvas?.save()
                canvas?.translate(200F, this.height / 2F)
                paint.color = color2
                canvas?.drawCircle(100F, 0F, 100F, paint)
                canvas?.restore()
                canvas?.save()
                canvas?.translate(400F, this.height / 2F)
                paint.color = color3
                canvas?.drawCircle(100F, 0F, 100F, paint)
                canvas?.restore()
                canvas?.save()
                canvas?.translate(600F, this.height / 2F)
                paint.color = color4
                canvas?.drawCircle(100F, 0F, 100F, paint)
                canvas?.restore()

            }
        }
        view.layoutParams = ViewGroup.LayoutParams(500, 200)
        AlertDialog.Builder(context).setTitle("建造者模式").setMessage("生成的图形")
            .setView(view)
            .show()
    }

    //内联方式调用
    //这里使用了 内联函数（inline） 以避免lambda的额外开销。
    inline fun show(func: BuilderDemo.() -> Unit) {
        this.func()
        this.show()
    }

}