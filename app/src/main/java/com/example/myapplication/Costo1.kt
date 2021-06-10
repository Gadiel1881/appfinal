package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_costo1.*

class Costo1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_costo1)
       btnverdatos.setOnClickListener {datos()}
        btnregre.setOnClickListener { finish() }
    }
    fun datos(){
        var usuario:String?= this.intent.getStringExtra("usuarrii")
        var habitacion:String?= this.intent.getStringExtra("habitac")
        var consumosala:String?= this.intent.getStringExtra("consumosal")
        var consumohora:String?= this.intent.getStringExtra("conhora")
        tvnom.setText("Propietario: $usuario")
        tvhab.setText("Habitacion: $habitacion")
        tvonsumo.setText("Consumo: $consumosala W \n Consumo hora: $consumohora kW/h")
        tvmonto.setText("Precio consumo: $ $consumohora MX")
        tvmontohora.setText("Precio hora: 1 kW = $ 1.0 MX")
    }
}