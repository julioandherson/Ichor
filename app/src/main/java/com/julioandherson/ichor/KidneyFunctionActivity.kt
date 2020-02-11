package com.julioandherson.ichor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class KidneyFunctionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kidney_function)

        val button1 = findViewById<Button>(R.id.option1Button)
        val button2 = findViewById<Button>(R.id.option2Button)
        val button3 = findViewById<Button>(R.id.option3Button)
        val button4 = findViewById<Button>(R.id.option4Button)

        val resetButton = findViewById<Button>(R.id.resetButton)

        val resultKidneyTextView = findViewById<TextView>(R.id.resultKidneyTextView)

        button1.setOnClickListener(View.OnClickListener {
            var result = "i. Primeira escolha: Apixabana é a droga com maior nível de evidência para pacientes com lesão renal, porém está entre as medicações de maior custo\n"
            result += "ii. Segunda escolha: Edoxabana\n"
            result += "iii. Terceira escolha: Rivaroxabana/Dabigatrana"

            resultKidneyTextView.setText(result)
        })

        button2.setOnClickListener(View.OnClickListener {
            var result = "TODO"
            resultKidneyTextView.setText(result)
        })

        button3.setOnClickListener(View.OnClickListener {
            resultKidneyTextView.setText("Usar Heparina ou Varfarina")
        })

        button4.setOnClickListener(View.OnClickListener {
            resultKidneyTextView.setText("Apixabana")
        })

        resetButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
    }
}
