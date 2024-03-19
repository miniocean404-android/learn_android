package com.example.learnandroidjava.activity

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.animation.addListener
import com.example.learnandroidjava.R
import org.w3c.dom.Text

class PropAnimActivity : AppCompatActivity() {

    private val tag = "mini_ocean"
    @SuppressLint("Recycle")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.animation_prop)

        val anim = ValueAnimator.ofFloat(0f, 1f)
        anim.duration = 2000
        anim.addUpdateListener {
            val value = it.animatedValue
            Log.i(tag, "onCreate: $value")
        }
        anim.start()

        val tv = findViewById<TextView>(R.id.animation_prop)
        ObjectAnimator.ofFloat(tv, "translationX", 200f).apply {
            duration = 2000
            start()

            addListener(object : Animator.AnimatorListener {
                override fun onAnimationStart(p0: Animator) {
                    TODO("Not yet implemented")
                }

                override fun onAnimationEnd(p0: Animator) {
                    TODO("Not yet implemented")
                }

                override fun onAnimationCancel(p0: Animator) {
                    TODO("Not yet implemented")
                }

                override fun onAnimationRepeat(p0: Animator) {
                    TODO("Not yet implemented")
                }
            })

            addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    TODO("Not yet implemented")
                }
            })
        }
    }
}