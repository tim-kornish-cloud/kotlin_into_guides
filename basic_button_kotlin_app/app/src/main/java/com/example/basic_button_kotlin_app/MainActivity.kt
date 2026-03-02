package com.example.basic_button_kotlin_app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var  button_add : Button
    lateinit var  button_sub : Button
    lateinit var  button_mul : Button
    lateinit var  button_div : Button
    lateinit var enter_first_val : EditText
    lateinit var enter_second_val : EditText
    lateinit var resultTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        button_add = findViewById(R.id.button_add)
        button_sub = findViewById(R.id.button_sub)
        button_mul = findViewById(R.id.button_mul)
        button_div = findViewById(R.id.button_div)
        enter_first_val = findViewById(R.id.enter_line_1)
        enter_second_val = findViewById(R.id.enter_line_2)
        resultTextView  = findViewById(R.id.result_text_view)

        button_add.setOnClickListener(this)
        button_sub.setOnClickListener(this)
        button_mul.setOnClickListener(this)
        button_div.setOnClickListener(this)

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }

    override fun onClick(v: View?) {
        var first_val = enter_first_val.text.toString().toDouble()
        var second_val = enter_second_val.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.button_add -> {
                result = first_val + second_val
            }
            R.id.button_sub -> {
                result = first_val - second_val
            }
            R.id.button_mul -> {
                result = first_val * second_val
            }
            R.id.button_div -> {
                result = first_val / second_val
            }
        }

        resultTextView.text = "Results is $result"
    }
}