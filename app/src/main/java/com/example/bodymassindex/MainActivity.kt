package com.example.bodymassindex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val calculate= findViewById<TextView>(R.id.calculate)
        calculate.setOnClickListener {
            (showresult())
        }

        }

    private fun calculateResult(): Double {
        val height_val = findViewById<EditText>(R.id.height)
        val weight_val = findViewById<EditText>(R.id.weight)

        val height = height_val.text.toString().toDouble()
        val weight = weight_val.text.toString().toDouble()

        val BMI = weight / height.pow(2)
        return BMI

    }

    private fun showresult(){
        val bmi = calculateResult()
        val resultbmi = findViewById<TextView>(R.id.result)
        val resultText = ("%.2f".format(resultbmi))
        resultbmi.text = resultText
    }



        }

