package com.example.holayo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// Modelo de datos
data class Perfil(
    val nombre: String,
    val dato: String,
    val apodo: String?   // ? significa que puede ser null
)

class MainActivity : AppCompatActivity() {

    private val perfil = Perfil(
        nombre = "Hernan Parma",
        dato = "Estoy cursando Aplicaciones Móviles",
        apodo = "Parma"
    )

    private var saludoFormal = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("VIDA", "Main onCreate") // Registro de nacimiento
        setContentView(R.layout.activity_main)

        val tvSaludo = findViewById<TextView>(R.id.tvSaludo)
        val tvDato = findViewById<TextView>(R.id.tvDato)
        val btnSaludar = findViewById<Button>(R.id.btnSaludar)
        val btnIrSegunda = findViewById<Button>(R.id.btnIrSegunda)

        // Si hay apodo se usa; si es null, se usa el nombre.
        val comoLlamarme = perfil.apodo ?: perfil.nombre

        tvSaludo.text = "Hola, soy $comoLlamarme"
        tvDato.text = perfil.dato

        // Lambda: función que se ejecuta cuando se toca el botón saludar.
        btnSaludar.setOnClickListener {
            saludoFormal = !saludoFormal

            tvSaludo.text = if (saludoFormal) {
                "Hola, soy $comoLlamarme"
            } else {
                "¡Buenas! Acá $comoLlamarme"
            }
        }

        // Viaje a la segunda pantalla con Intent explícito y equipaje[cite: 2]
        btnIrSegunda.setOnClickListener {
            val intent = Intent(this, SegundaActivity::class.java)
            intent.putExtra("nombre", comoLlamarme)
            startActivity(intent)
        }
    }

    // Métodos del ciclo de vida instrumentados con Logcat[cite: 2]
    override fun onStart() {
        super.onStart()
        Log.d("VIDA", "Main onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("VIDA", "Main onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("VIDA", "Main onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("VIDA", "Main onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("VIDA", "Main -> onDestroy")
    }
}