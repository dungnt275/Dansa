package com.dungnt.dansa

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import kotlinx.coroutines.*

class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed(Runnable {
            startActivity(Intent(this, MainActivity::class.java))
        }, 3000)
    }
}