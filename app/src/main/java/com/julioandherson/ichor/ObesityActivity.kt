package com.julioandherson.ichor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class ObesityActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obesity)

        val noButton = findViewById<Button>(R.id.noObesityButton)
        val yesButton = findViewById<Button>(R.id.yesObesityButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        var resultTextView = findViewById<TextView>(R.id.obesityResultTextView)

        noButton.setOnClickListener(View.OnClickListener {
            var result = "Avaliar custo médio. Custo para três meses de tratamento:\n"
            result += "1. Até R$400,00: Dabigatrana\n"
            result += "2. Até R$700,00: Edoxabana\n"
            result += "3. Até R$1.100,00: Rivaroxabana ou Apixabana"
            resultTextView.setText(result)
        })

        yesButton.setOnClickListener(View.OnClickListener {
            resultTextView.setText("Rivaroxabana")
        })

        resetButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, ChooseClinicalProfileActivity::class.java)
            startActivity(intent)
        })
    }
}
