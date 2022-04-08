package com.inegru.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    
    private var diceRollCount: Int = 0
    private lateinit var rollDiceNumber: TextView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        rollDiceNumber = findViewById(R.id.textView)
        rollDiceNumber.text = diceRollCount.toString()
        val rollDice: Button = findViewById(R.id.button)
        rollDice.setOnClickListener { 
            diceRollCount++
            rollDiceNumber.text = diceRollCount.toString()
        }
    }
    
}