package com.julioandherson.ichor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ChooseClinicalProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_clinical_profile)

        val kidneyFunctionButton = findViewById<Button>(R.id.kidneyFunctionButton)
        val obesityButton = findViewById<Button>(R.id.button2)
        val elderlyButton = findViewById<Button>(R.id.button3)
        val gastroButton = findViewById<Button>(R.id.button4)
        val gynecologicalButton = findViewById<Button>(R.id.button5)

        kidneyFunctionButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, KidneyFunctionActivity::class.java)
            startActivity(intent)
        })

        obesityButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, ObesityActivity::class.java)
            startActivity(intent)
        })

        elderlyButton.setOnClickListener(View.OnClickListener {

        })

        gastroButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, GastrointestinalDiseaseActivity::class.java)
            startActivity(intent)
        })

        gynecologicalButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, GynecologicalActivity::class.java)
            startActivity(intent)
        })
    }
}
