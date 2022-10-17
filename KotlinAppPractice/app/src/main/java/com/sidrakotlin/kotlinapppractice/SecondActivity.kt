package com.sidrakotlin.kotlinapppractice

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    lateinit var email : TextView
    lateinit var pass :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_second)

        init();
    }

    private fun init()
    {
        email = findViewById(R.id.emailText);
        pass = findViewById(R.id.passText);

        val bundle:Bundle?=intent.extras;
        val emailShow = bundle?.get("email")
        val passShow = bundle?.get("pass")
        email.text=emailShow.toString();
        pass.text=passShow.toString()
    }
}