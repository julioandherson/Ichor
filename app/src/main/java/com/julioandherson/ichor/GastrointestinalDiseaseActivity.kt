package com.julioandherson.ichor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_gastrointestinal_disease.*

class GastrointestinalDiseaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gastrointestinal_disease)

        val noGastroButton = findViewById<Button>(R.id.gastroNoButton)
        val yesGastroButton = findViewById<Button>(R.id.gastroYesButton)
        val reset = findViewById<Button>(R.id.resetGastroButton)
        var result = findViewById<TextView>(R.id.resultGastroTextView)

        noGastroButton.setOnClickListener(View.OnClickListener {
            var resultString = "Avaliar custo médio. Custo para três meses de tratamento:\n"
            resultString += "i. Até R$400,00: Dabigatrana\n"
            resultString += "ii. Até R$700,00: Edoxabana\n"
            resultString += "iii. Até R$1.100,00: Rivaroxabana ou Apixabana"

            result.setText(resultString)
        })

        yesGastroButton.setOnClickListener(View.OnClickListener {
            result.setText("Preferência por Heparina ou Varfarina. Caso DOAC seja escolhido, evitar Rivaroxabana e Dabigatrana")
        })

        reset.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, ChooseClinicalProfileActivity::class.java)
            startActivity(intent)
        })
    }
}
