package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sala.*

class sala : AppCompatActivity() {
    var consumosala:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sala)
        var usuarii:String?= this.intent.getStringExtra("usuari")
        var habita:String?= this.intent.getStringExtra("habi")
        var cfocosafuera: Int = 300
        var cabanicocielo: Int = 120
        var cfocoadeentro: Int = 100
        var cclima: Int = 1280
        if (cbfocoafuera.isChecked == true) {
            consumosala = consumosala + cfocosafuera
            tvconsap.setText("Consumo: W")
            tvconstotal.setText("Consumo total: $consumosala W")
        }
        if (cbabanico.isChecked == true) {
            consumosala = consumosala + cabanicocielo
            tvconsap.setText("Consumo: W")
            tvconstotal.setText("Consumo total: $consumosala W")
        }
        if (cbfoco.isChecked == true) {
            consumosala = consumosala + cfocoadeentro
            tvconsap.setText("Consumo: W")
            tvconstotal.setText("Consumo total: $consumosala W")
        }
        if (cbclima.isChecked == true) {
            consumosala = consumosala + cclima
            tvconsap.setText("Consumo: W")
            tvconstotal.setText("Consumo total: $consumosala W")
        }
        tvconsap.setText("Consumo: W")
        tvconstotal.setText("Consumo total: $consumosala W")
        cbfocoafuera.setOnClickListener {
            if (cbfocoafuera.isChecked == true) {
                consumosala = consumosala + cfocosafuera
                tvconsap.setText("Consumo: $cfocosafuera W")
                tvconstotal.setText("Consumo total: $consumosala W")
            }else{
                consumosala = consumosala - cfocosafuera
                tvconsap.setText("Consumo: W")
                tvconstotal.setText("Consumo total: $consumosala W")
            }
        }
        cbabanico.setOnClickListener {
            if (cbabanico.isChecked == true) {
                consumosala = consumosala + cabanicocielo
                tvconsap.setText("Consumo: $cabanicocielo W")
                tvconstotal.setText("Consumo total: $consumosala W")
            }else{
                consumosala = consumosala - cabanicocielo
                tvconsap.setText("Consumo: W")
                tvconstotal.setText("Consumo total: $consumosala W")
            }
        }
        cbfoco.setOnClickListener {
            if (cbfoco.isChecked == true) {
                consumosala = consumosala + cfocoadeentro
                tvconsap.setText("Consumo: $cfocoadeentro W")
                tvconstotal.setText("Consumo total: $consumosala W")
            }else{
                consumosala = consumosala - cfocoadeentro
                tvconsap.setText("Consumo: W")
                tvconstotal.setText("Consumo total: $consumosala W")
            }
        }
        cbclima.setOnClickListener {
            if (cbclima.isChecked == true) {
                consumosala = consumosala + cclima
                tvconsap.setText("Consumo: $cclima W")
                tvconstotal.setText("Consumo total: $consumosala W")
            }else{
                consumosala = consumosala - cclima
                tvconsap.setText("Consumo: W")
                tvconstotal.setText("Consumo total: $consumosala W")
            }
        }
        btnquitar.setOnClickListener {
            val intnsala: Intent = Intent(this, Costo1::class.java)
            var salaconsumo:Double = (consumosala).toDouble()
            var chora:Double = salaconsumo/1000
            var consum:String=(consumosala).toString()
            var conshora:String=(chora).toString()
            intnsala.putExtra("consumosal", consum)
            intnsala.putExtra("usuarrii", usuarii)
            intnsala.putExtra("habitac", habita)
            intnsala.putExtra("conhora", conshora)
            startActivity(intnsala)
        }
        btnregre.setOnClickListener { finish() }
    }
}