package com.example.androidquizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val scoreText = findViewById<TextView>(R.id.scoreText)
        val retakeBtn = findViewById<Button>(R.id.retakeBtn)

        val receivedIntent = intent
        val score = receivedIntent.getIntExtra("SCORE", 0)

        scoreText.text = "You scored: $score"

        retakeBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}