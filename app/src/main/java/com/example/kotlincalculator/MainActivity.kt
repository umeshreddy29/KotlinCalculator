package com.example.kotlincalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity(), View.OnClickListener{

    lateinit var etA : EditText
    lateinit var etB : EditText
    lateinit var btnAdd  : Button
    lateinit var btnSub  : Button
    lateinit var btnMult : Button
    lateinit var btnDiv  : Button
    lateinit var resultTV  : TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etA = findViewById(R.id.ed_a)
        etB = findViewById(R.id.ed_b)
        btnAdd = findViewById(R.id.btn_add)
        btnSub = findViewById(R.id.btn_sub)
        btnMult = findViewById(R.id.btn_mult)
        btnDiv = findViewById(R.id.btn_divide)
        resultTV = findViewById(R.id.result)

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMult.setOnClickListener(this)
        btnDiv.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val a = etA.text.toString().toDouble()
        val b = etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.btn_add ->{
                result = a+b
            }
            R.id.btn_sub ->{
                result = a-b
            }
            R.id.btn_mult ->{
                result = a*b
            }
            R.id.btn_divide ->{
                result = a/b
            }
        }

        resultTV.text = "the result is $result"
    }
}