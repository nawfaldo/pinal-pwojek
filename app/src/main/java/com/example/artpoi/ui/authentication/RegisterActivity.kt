package com.example.artpoi.ui.authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.artpoi.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn_register.setOnClickListener {
            startActivity(Intent(this@RegisterActivity, WelcomeActivity::class.java))
        }
        iv_close.setOnClickListener {
            onBackPressed()
        }
    }
}