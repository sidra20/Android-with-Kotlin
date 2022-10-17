package com.sidrakotlin.kotlinapppractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var emailLogin:EditText;
    lateinit var passLogin:EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        emailLogin = findViewById(R.id.email);
        passLogin = findViewById(R.id.pass);
    }
    fun loginClick(v:View)
    {
        var email = emailLogin.text.toString()
        var pass = passLogin.text.toString()


        if((email!=null) && (pass!=null))
        {
            val intent = Intent(this, SecondActivity::class.java);
            intent.putExtra("email", email);
            intent.putExtra("pass", pass);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "Field is required",Toast.LENGTH_SHORT).show();55
        }


    }
}