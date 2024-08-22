package com.example.mibandera

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var descriptionTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        descriptionTextView = findViewById(R.id.descriptionTextView)

        val btnAmarillo: Button = findViewById(R.id.btnAmarillo)
        val btnAzul: Button = findViewById(R.id.btnAzul)
        val btnRojo: Button = findViewById(R.id.btnRojo)

        btnAmarillo.setOnClickListener {
            imageView.setImageResource(R.drawable.amarillo)
            descriptionTextView.text = "El color amarillo de la bandera de Colombia simboliza la riqueza del país."
        }

        btnAzul.setOnClickListener {
            imageView.setImageResource(R.drawable.azul)
            descriptionTextView.text = "Azul: Representa los vastos océanos y ríos de Colombia."
        }

        btnRojo.setOnClickListener {
            imageView.setImageResource(R.drawable.rojo)
            descriptionTextView.text = "Rojo: Simboliza la sangre derramada por los patriotas TK."
        }
    }
}