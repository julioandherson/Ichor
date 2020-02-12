package com.julioandherson.ichor

import android.content.Intent
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
        val resetButton = findViewById<Button>(R.id.elderlyResetButton)

        noButton.setOnClickListener(View.OnClickListener {
            var resultText = "Avaliar custo médio. Custo para três meses de tratamento:\n"
            resultText += "1. Até R$400,00: Dabigatrana\n"
            resultText += "2. Até R$700,00: Edoxabana\n"
            resultText += "3. Até R$1.100,00: Rivaroxabana ou Apixabana"
            result.setText(resultText)
        })

        yesButton.setOnClickListener(View.OnClickListener {
            result.setText("Evitar uso do Dabigatrana")
        })

        resetButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, ChooseClinicalProfileActivity::class.java)
            startActivity(intent)
        })
    }
}
