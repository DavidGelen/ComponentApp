package com.wwe.amoudle

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.login_layout.*

/**
 * @name ComponentApp
 * @class name：com.wwe.amoudle
 * @class describe
 * @anthor David
 * @time 2019/3/2 1:58 PM
 * @class describe
 */
class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.login_layout)
        val intent = Intent(this,Class.forName("com.wwe.MainActivity"))
        modulea_button.setOnClickListener {
            startActivity(intent)
        }
    }
}