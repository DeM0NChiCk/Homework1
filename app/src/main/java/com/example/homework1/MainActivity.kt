package com.example.homework1

import android.os.Bundle

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var counter: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val height: EditText = findViewById(R.id.editTextNumber)
        val weight: EditText = findViewById(R.id.editTextNumber2)
        val age: EditText = findViewById(R.id.editTextNumber3)
        val username: EditText = findViewById(R.id.textInputEditText2)
        val answer: TextView = findViewById(R.id.textView)




        button.setOnClickListener{
            val strUserName = username.text.toString()
            val strHeight = height.text.toString()
            val strWeight = weight.text.toString()
            val strAge = age.text.toString()
            val a = Integer.parseInt(strHeight)
            val b = Integer.parseInt(strWeight)
            val c = Integer.parseInt(strAge)



            if ((strUserName.trim()!="") and (a<250) and (b<250) and (c<150) and (a>0) and (b>0) and (c>0)) {
                counter = 10 * a + 6 * b + c * 5 + 5
                answer.text = "$strUserName ваше количество калорий $counter"
            } else {
                answer.text="Данные введены некорректно."
            }
        }
    }


}