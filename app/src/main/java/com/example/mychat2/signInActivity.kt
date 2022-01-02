package com.example.mychat2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class signInActivity : AppCompatActivity() {
    //تعريف عناصر تسجيل الدخول
    private var edEmailSign:EditText? = null
    private var edPassSign:EditText? = null
    private var butsignIn:Button? = null
    private var tvCreateAcc:TextView? = null
    private var tvForgotPass:TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        //ربط عناصر تسجي الدخول
        connectView()
        createNewAccaunt()
    }
    // دالة ربط عناصر نسجيل الدخول
    private fun connectView(){
        edEmailSign = findViewById(R.id.edEmailSignIn)
        edPassSign = findViewById(R.id.edPasSignIn)
        butsignIn = findViewById(R.id.butSignIn)
        tvCreateAcc =  findViewById(R.id.createAccount)
        tvForgotPass = findViewById(R.id.tvForgotPass)
    }
    // عند النقر على زر انشاء حساب
    private fun createNewAccaunt(){
        tvCreateAcc?.setOnClickListener {
            val intent1 = Intent(this,signUpActivity::class.java)
            startActivity(intent1)
        }
    }
}