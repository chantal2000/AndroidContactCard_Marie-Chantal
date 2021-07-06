package com.example.contactscard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tlName: TextInputLayout
    lateinit var tlPhone:TextInputLayout
    lateinit var tlEmail:TextInputLayout
    lateinit var btnContinue:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        btnContinue()
    }


    fun castViews() {
        tlName=findViewById(R.id.tlName)
        tlPhone=findViewById(R.id.tlPhone)
        tlEmail=findViewById(R.id.tlEmail)
        btnContinue=findViewById(R.id.btn)

    }
    fun btnContinue(){
        btnContinue.setOnClickListener {
            var intent= Intent(baseContext,ContactACtivity::class.java)
            startActivity(intent)
        }
    }
}