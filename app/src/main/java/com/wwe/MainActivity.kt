package com.wwe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val it = Class.forName("com.wwe.amoudle.LoginActivity")
        val intent = Intent(this, it)
        button.setOnClickListener {
            startActivity(intent)
        }
    }
}