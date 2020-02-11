package com.julioandherson.ichor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LesionTGI : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesion_tgi)

        val noButton = findViewById<Button>(R.id.noLesionButton)
        val yesButton = findViewById<Button>(R.id.yesLesionButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val resultText = findViewById<TextView>(R.id.lesionResultTextView)

        noButton.setOnClickListener(View.OnClickListener {
            resultText.setText("Custo para três meses de tratamento:\n1. Até R$700,00: Edoxabana\n2.Até R$1.100,00: Rivaroxabana ou Apixabana")
        })

        yesButton.setOnClickListener(View.OnClickListener {
            resultText.setText("Usar Heparina ou Varfarina")
        })

        resetButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
    }
}
