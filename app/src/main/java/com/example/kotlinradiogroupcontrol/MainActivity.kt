package com.example.kotlinradiogroupcontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tvResultado : TextView
/// comentario para subir cambios


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)
        val radio1 = findViewById<RadioButton>(R.id.rb1)
        val radio2 = findViewById<RadioButton>(R.id.rb2)
        val buttonOperation = findViewById<Button>(R.id.bOperacion)
        tvResultado = findViewById(R.id.tvResultado)


        buttonOperation.setOnClickListener {
            val valor_1 = et1.text.toString().toInt()
            val valor_2 = et2.text.toString().toInt()
            if (radio1.isChecked)
                reproducirOperacion(valor_1, valor_2, "+")
            if (radio2.isChecked)
                reproducirOperacion(valor_1, valor_2, "-")

        }

//////////////// vamos de nuevom con los cambios

    }

    private fun reproducirOperacion(valor1: Int, valor2: Int, s: String) {
        var resultado = 0

        if("+".equals(s))
            resultado = valor1 + valor2

        if ("-".equals(s))
            resultado = valor1 - valor2


        tvResultado.text = "El resultado es " + resultado
    }

    //// quiero ver que se suban los cambios
}