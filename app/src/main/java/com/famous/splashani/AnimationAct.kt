package com.famous.splashani

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AnimationAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        val actionBar = supportActionBar
        actionBar!!.title = "Animation Activity"
    }
}