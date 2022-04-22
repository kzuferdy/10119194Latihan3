package com.kzuferdy.a10119194latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_code_login.*

class CodeLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_login)

        btn_next.setOnClickListener(){
            var intent = Intent(this@CodeLoginActivity, BiodataActivity::class.java)
            startActivity(intent)
        }

    }
}