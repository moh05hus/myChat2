package com.example.mychat2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class signUpActivity : AppCompatActivity(),TextWatcher{
    private var edEmailSignUp: EditText? = null
    private var edPassSignUp: EditText? = null
    private var edNameSignUp: EditText? = null
    private var butsignUp: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        connectView()
        //هنا التصنت على الفراغات
        edNameSignUp?.addTextChangedListener(this)
        edPassSignUp?.addTextChangedListener(this)
        edEmailSignUp?.addTextChangedListener(this)
    }
    private fun connectView(){
        edNameSignUp = findViewById(R.id.edNameSignUp)
        edEmailSignUp = findViewById(R.id.edEmailSignUp)
        edPassSignUp = findViewById(R.id.edPasSignUp)
        butsignUp= findViewById(R.id.butSignUp)
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

    }

    override fun afterTextChanged(s: Editable?) {
        //هنا لاتاكد ان الفراغات ليسة فارغه لتغير لون الزر
    butsignUp?.isEnabled =edNameSignUp?.text!!.trim().toString().isNotEmpty()
            && edPassSignUp?.text!!.trim().toString().isNotEmpty()
            && edEmailSignUp?.text!!.trim().toString().isNotEmpty()
    }
}