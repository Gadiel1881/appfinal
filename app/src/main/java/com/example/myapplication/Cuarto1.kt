package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cuarto1.*
/*import kotlinx.android.synthetic.main.activity_main.*/

class Cuarto1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuarto1)
        Toast.makeText(this, "Bienvenido \n Selecciona habitacion ", Toast.LENGTH_LONG).show()

        var usuar:String?= this.intent.getStringExtra("usua")
        tvsaludo.setText("Hola $usuar")

        btndatos.setOnClickListener {
            try {
                if (rbsala.isChecked == true) {
                    val intsala: Intent = Intent(this, sala::class.java)
                    var hab: String = "Sala"
                    intsala.putExtra("usuari", usuar)
                    intsala.putExtra("habi", hab)
                    startActivity(intsala)
                }

                if (rbcomedor.isChecked == true) {
                    val intcom: Intent = Intent(this, Comedor::class.java)
                    var ha: String = "Comedor"
                    intcom.putExtra("usuari", usuar)
                    intcom.putExtra("habi", ha)
                    startActivity(intcom)
                }
                if (rbcocina.isChecked == true) {
                    val intcoc: Intent = Intent(this, Cocina::class.java)
                    var ha: String = "Cocina"
                    intcoc.putExtra("usuari", usuar)
                    intcoc.putExtra("habi", ha)
                    startActivity(intcoc)
                }
                if (rblavanderia.isChecked == true) {
                    val intcoc: Intent = Intent(this, Lavanderia::class.java)
                    var ha: String = "Lavanderia"
                    intcoc.putExtra("usuari", usuar)
                    intcoc.putExtra("habi", ha)
                    startActivity(intcoc)
                }

            } catch (mensaje: NumberFormatException) {
                android.widget.Toast.makeText(
                    this,
                    "Datos de entrada incompletos...",
                    android.widget.Toast.LENGTH_SHORT
                ).show()
            }

        }
        btncsesion.setOnClickListener { finish() }
    }
}