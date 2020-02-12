package com.julioandherson.ichor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class GynecologicalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gynecological)

        val noButton = findViewById<Button>(R.id.gynecologicalNoButton)
        val yesButton = findViewById<Button>(R.id.gynecologicalYesButton)
        val reset = findViewById<Button>(R.id.gynecologicalResetButton)
        val textView = findViewById<TextView>(R.id.gynecologicalResultTextView)

        noButton.setOnClickListener(View.OnClickListener {
            var result = "Avaliar custo médio. Custo para três meses de tratamento:\n"
            result += "i. Até R$400,00: Dabigatrana\n"
            result += "ii. Até R$700,00: Edoxabana\n"
            result += "iii. Até R$1.100,00: Rivaroxabana ou Apixabana"
            textView.setText(result)
        })

        yesButton.setOnClickListener(View.OnClickListener {
            textView.setText("Evitar uso de Rivaroxabana")
        })

        reset.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, ChooseClinicalProfileActivity:: class.java)
            startActivity(intent)
        })
    }
}
