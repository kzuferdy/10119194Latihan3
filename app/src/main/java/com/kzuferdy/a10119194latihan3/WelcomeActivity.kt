package com.kzuferdy.a10119194latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        btn_home.setOnClickListener(){
            var intent = Intent(this@WelcomeActivity, CodeLoginActivity::class.java)
            startActivity(intent)
        }

    }
}