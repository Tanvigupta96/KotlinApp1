package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.text.InputFilter
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var userNameEditText : EditText
    private lateinit var passwordEditText : EditText
    private lateinit var sign_in_btn : Button
    private lateinit var sign_up_txt : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeFields()

        sign_in_btn.setOnClickListener {
            val username : String = userNameEditText.text.toString()
            val pass : String = passwordEditText.text.toString()
            if(TextUtils.isEmpty(username)){
                Toast.makeText(this,"Enter Username FirstName",LENGTH_SHORT).show()
            }
            if(TextUtils.isEmpty(pass)){
                Toast.makeText(this,"Enter Password first", LENGTH_SHORT).show()
            }
            else{
                var intent = Intent(this,LoginActivity::class.java)
                startActivity(intent)


            }
        }
    }

    private fun initializeFields() {
        userNameEditText = findViewById(R.id.login_username)
        passwordEditText = findViewById(R.id.login_password)
        sign_in_btn = findViewById(R.id.sign_in_button)
        sign_up_txt = findViewById(R.id.sign_up_txt)



    }
}


