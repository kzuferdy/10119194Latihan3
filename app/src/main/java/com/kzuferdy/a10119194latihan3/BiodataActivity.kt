package com.kzuferdy.a10119194latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_biodata.*

class BiodataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        btn_next.setOnClickListener(){
            var intent = Intent(this@BiodataActivity, SayHiActivity::class.java)
            startActivity(intent)
        }

    }
}