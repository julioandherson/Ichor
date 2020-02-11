package com.julioandherson.ichor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val yesButton = findViewById<Button>(R.id.yesMainButton)
        val noButton = findViewById<Button>(R.id.noMainButton)
        var result = findViewById<TextView>(R.id.mainResultTextView)

        yesButton.setOnClickListener(View.OnClickListener {
            // TODO: Remover OncologicalActivity e LesionTGIActivity
//            val intent = Intent(this, OncologicalDiseaseActivity::class.java)
//            startActivity(intent)
            result.setText("Usar Heparina ou Varfarina")
        })

        noButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, ChooseClinicalProfileActivity::class.java)
            startActivity(intent)
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.actions, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_info -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
