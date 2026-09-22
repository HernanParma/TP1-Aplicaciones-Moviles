package com.example.holayo

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SegundaActivity : AppCompatActivity() {

    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("VIDA", "Segunda onCreate")
        setContentView(R.layout.activity_segunda)

        // Recibir el equipaje enviado desde la primera pantalla
        val nombre = intent.getStringExtra("nombre") ?: "misterioso visitante"
        findViewById<TextView>(R.id.tvBienvenida).text = "Sala de experimentos de $nombre"

        // Configuración del contador del laboratorio
        val tvContador = findViewById<TextView>(R.id.tvContador)
        tvContador.text = contador.toString()

        findViewById<Button>(R.id.btnSumar).setOnClickListener {
            contador++
            tvContador.text = contador.toString()
        }
    }

    // Métodos del ciclo de vida instrumentados para la segunda pantalla
    override fun onStart() {
        super.onStart()
        Log.d("VIDA", "Segunda onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("VIDA", "Segunda onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("VIDA", "Segunda onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("VIDA", "Segunda onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("VIDA", "Segunda -> onDestroy")
    }
}