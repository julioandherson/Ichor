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

        noButton.setOnClickListener(View.OnClickListener {
            resultText.setText("Usar Heparina ou Varfarina")
        })

        yesButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, LesionTGI::class.java)
            startActivity(intent)
        })
    }
}
