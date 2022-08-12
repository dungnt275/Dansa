package com.dungnt.dansa

import android.os.Bundle
import androidx.core.view.WindowCompat

class HomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        WindowCompat.setDecorFitsSystemWindows(window, false)
    }
}