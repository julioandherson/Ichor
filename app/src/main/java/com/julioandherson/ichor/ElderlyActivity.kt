package com.julioandherson.ichor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class ElderlyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elderly)

        val noButton = findViewById<Button>(R.id.elderlyNoButton)
        val yesButton = findViewById<Button>(R.id.elderlyYesButton)
        val result = findViewById<TextView>(R.id.elderlyResultTextView)

        noButton.setOnClickListener(View.OnClickListener {
            result.setText("Ok")
        })
        yesButton.setOnClickListener(View.OnClickListener {
            result.setText("Evitar uso do Dabigatrana")
        })
    }
}
