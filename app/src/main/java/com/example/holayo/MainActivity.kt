package com.example.holayo

import android.os.Bundle
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
        setContentView(R.layout.activity_main)

        val tvSaludo = findViewById<TextView>(R.id.tvSaludo)
        val tvDato = findViewById<TextView>(R.id.tvDato)
        val btnSaludar = findViewById<Button>(R.id.btnSaludar)

        // Si hay apodo se usa; si es null, se usa el nombre.
        // El operador ?: funciona como un "plan B".
        val comoLlamarme = perfil.apodo ?: perfil.nombre

        tvSaludo.text = "Hola, soy $comoLlamarme"
        tvDato.text = perfil.dato

        // Lambda: función que se ejecuta cuando se toca el botón.
        btnSaludar.setOnClickListener {
            saludoFormal = !saludoFormal

            tvSaludo.text = if (saludoFormal) {
                "Hola, soy $comoLlamarme"
            } else {
                "¡Buenas! Acá $comoLlamarme"
            }
        }
    }
}