package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.appbar.MaterialToolbar

class PrecoCombustivelMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_preco_combustivel_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val toolBar = findViewById<MaterialToolbar>(R.id.toolBar_preco_combustivel)
        setSupportActionBar(toolBar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)


        val edtPrecoCombustivel = findViewById<EditText>(R.id.edtPrecoCombustivel)
        val btnPrecoCombustivelProximo = findViewById<Button>(R.id.btnPrecoCombustivelProximo)

        btnPrecoCombustivelProximo.setOnClickListener {

            val edtPrecoCombutivelValor = edtPrecoCombustivel.text.toString().toDouble()
            val intent = Intent(this, ConsumoPorLitroActivity::class.java)
            intent.putExtra("PRECO_COMBUSTIVEL", edtPrecoCombutivelValor)
            startActivity(intent)

        }
    }

        override  fun onOptionsItemSelected(item: MenuItem): Boolean {
            return when (item.itemId) {
                android.R.id.home -> {
                    finish()
                    true
                }

                else -> super.onOptionsItemSelected(item)
            }
        }

    }
