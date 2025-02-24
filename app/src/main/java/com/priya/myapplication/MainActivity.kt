package com.priya.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        val ETFirstNum = findViewById(R.id.FirstNum) as EditText
        val ETSecondNum = findViewById(R.id.SecondNum) as EditText
        val TVResult = findViewById(R.id.ResultCal) as TextView

        val BTNAdd = findViewById(R.id.AdditionBTN) as Button
        val BTNSubtract = findViewById(R.id.SubtractionBTN) as Button
        val BTNMultiply = findViewById(R.id.MultiplicationBTN) as Button
        val BTNDivide = findViewById(R.id.DivisionBTN) as Button


        BTNAdd.setOnClickListener {

            val Num1 = ETFirstNum.text.toString()
            val Num2 = ETSecondNum.text.toString()

            if (Num1.isBlank() || Num2.isBlank())
            {
                TVResult.setText("Enter a number")
            }
            else
            {
                val Num1 = ETFirstNum.text.toString().toDouble()
                val Num2 = ETSecondNum.text.toString().toDouble()

                val Result = Num1 + Num2;
                TVResult.setText("$Num1 + $Num2 = $Result")
            }
        }

        BTNSubtract.setOnClickListener {

            val Num1 = ETFirstNum.text.toString()
            val Num2 = ETSecondNum.text.toString()

            if (Num1.isBlank() || Num2.isBlank())
            {
                TVResult.setText("Enter a number")
            }
            else
            {
                val Num1 = ETFirstNum.text.toString().toDouble()
                val Num2 = ETSecondNum.text.toString().toDouble()

                val Result = Num1 - Num2;
                TVResult.setText("$Num1 - $Num2 = $Result")
            }
        }

        BTNMultiply.setOnClickListener {

            val Num1 = ETFirstNum.text.toString()
            val Num2 = ETSecondNum.text.toString()

            if (Num1.isBlank() || Num2.isBlank())
            {
                TVResult.setText("Enter a number")
            }
            else
            {
                val Num1 = ETFirstNum.text.toString().toDouble()
                val Num2 = ETSecondNum.text.toString().toDouble()

                val Result = Num1 * Num2;
                TVResult.setText("$Num1 * $Num2 = $Result")
            }
        }

        BTNDivide.setOnClickListener {

            val Num1 = ETFirstNum.text.toString()
            val Num2 = ETSecondNum.text.toString()

            if (Num1.isBlank() || Num2.isBlank())
            {
                TVResult.setText("Enter a number")
            }

            else{
                val Num1 = ETFirstNum.text.toString().toDouble()
                val Num2 = ETSecondNum.text.toString().toDouble()

                val Result = Num1/Num2
                TVResult.setText("$Num1 / $Num2 = $Result")

                if (Num2==0.0){
                    TVResult.setText("Number cannot be divided by zero")
                }
            }


        }


    }
}

/*
References
Title: Kotlin Operators
Author: W3Schools
Date: 2025
Availability: https://www.w3schools.com/kotlin/kotlin_operators.php
*/