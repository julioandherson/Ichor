package com.julioandherson.ichor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class OncologicalDiseaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oncological_disease)

        val noButton = findViewById<Button>(R.id.noOncologyButton)
        val yesButton = findViewById<Button>(R.id.yesOncologyButton)
        var resultText = findViewById<TextView>(R.id.resultOncologyTextView)
        val resetButton = findViewById<Button>(R.id.oncologicalResetButton)
        noButton.setOnClickListener(View.OnClickListener {
            var result = "Considerar custo do tratamento. Valor para três meses de tratamento:\n"
            result += "   1. Até R$400,00: Dabigatrana\n"
            result += "   2. Até R$700,00: Edoxabana\n"
            result += "   3. Até R$1.100,00: Rivaroxabana ou Apixabana"
            resultText.setText(result)
        })

        yesButton.setOnClickListener(View.OnClickListener {
            var result = "Paciente apresenta lesão de TGI alto ou TGU?\n"
            result += "i. Sim: Usar Heparina ou Fundaparinux\n"
            result += "   1. Até R$700,00: Edoxabana\n"
            result += "   2. Até R$1.100,00: Rivaroxabana ou Apixabana\n"
            result += "ii. Não: Considerar custo do tratamento. Valor para três meses de tratamento:\n"
            result += "   1. Até R$400,00: Dabigatrana\n"
            result += "   2. Até R$700,00: Edoxabana\n"
            result += "   3. Até R$1.100,00: Rivaroxabana ou Apixabana"

            resultText.setText(result)
        })

        resetButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, ChooseClinicalProfileActivity::class.java)
            startActivity(intent)
        })
    }
}
