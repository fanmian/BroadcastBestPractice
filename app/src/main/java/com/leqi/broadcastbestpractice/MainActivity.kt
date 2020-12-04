package com.leqi.broadcastbestpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        forceOffline.setOnClickListener {
            val intent = Intent("com.leqi.broadcastbestpractice.FORCE_OFFLINE")
            sendBroadcast(intent)
            Toast.makeText(this, "Second commit", Toast.LENGTH_SHORT).show()
        }
    }
}