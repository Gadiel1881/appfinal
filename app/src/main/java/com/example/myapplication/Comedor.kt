package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_comedor.*

class Comedor : AppCompatActivity() {
    var consumocomedor:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comedor)
        var usuarii:String?= this.intent.getStringExtra("usuari")
        var habita:String?= this.intent.getStringExtra("habi")
        var cabanico: Int = 200
        var ctele: Int = 250
        var cteatro: Int = 300
        var cfoco: Int = 100
        if (cbabanicon.isChecked == true) {
            consumocomedor = consumocomedor + cabanico
            tvconsap.setText("Consumo: W")
            tvconstotal.setText("Consumo total: $consumocomedor W")
        }
        if (cbtvcom.isChecked == true) {
            consumocomedor = consumocomedor + ctele
            tvconsap.setText("Consumo: W")
            tvconstotal.setText("Consumo total: $consumocomedor W")
        }
        if (cbteccom.isChecked == true) {
            consumocomedor = consumocomedor + cteatro
            tvconsap.setText("Consumo: W")
            tvconstotal.setText("Consumo total: $consumocomedor W")
        }
        if (cbfccom.isChecked == true) {
            consumocomedor = consumocomedor + cfoco
            tvconsap.setText("Consumo: W")
            tvconstotal.setText("Consumo total: $consumocomedor W")
        }
        tvconsap.setText("Consumo: W")
        tvconstotal.setText("Consumo total: $consumocomedor W")
        cbabanicon.setOnClickListener {
            if (cbabanicon.isChecked == true) {
                consumocomedor = consumocomedor + cabanico
                tvconsap.setText("Consumo: $cabanico W")
                tvconstotal.setText("Consumo total: $consumocomedor W")
            }else{
                consumocomedor = consumocomedor - cabanico
                tvconsap.setText("Consumo: W")
                tvconstotal.setText("Consumo total: $consumocomedor W")
            }
        }
        cbtvcom.setOnClickListener {
            if (cbtvcom.isChecked == true) {
                consumocomedor = consumocomedor + ctele
                tvconsap.setText("Consumo: $ctele W")
                tvconstotal.setText("Consumo total: $consumocomedor W")
            }else{
                consumocomedor = consumocomedor - ctele
                tvconsap.setText("Consumo: W")
                tvconstotal.setText("Consumo total: $consumocomedor W")
            }
        }
        cbteccom.setOnClickListener {
            if (cbteccom.isChecked == true) {
                consumocomedor = consumocomedor + cteatro
                tvconsap.setText("Consumo: $cteatro W")
                tvconstotal.setText("Consumo total: $consumocomedor W")
            }else{
                consumocomedor = consumocomedor - cteatro
                tvconsap.setText("Consumo: W")
                tvconstotal.setText("Consumo total: $consumocomedor W")
            }
        }
        cbfccom.setOnClickListener {
            if (cbfccom.isChecked == true) {
                consumocomedor = consumocomedor + cfoco
                tvconsap.setText("Consumo: $cfoco W")
                tvconstotal.setText("Consumo total: $consumocomedor W")
            }else{
                consumocomedor = consumocomedor - cfoco
                tvconsap.setText("Consumo: W")
                tvconstotal.setText("Consumo total: $consumocomedor W")
            }
        }
        btnquitar.setOnClickListener {
            val intnsala: Intent = Intent(this, Costo1::class.java)
            var comconsumo:Double = (consumocomedor).toDouble()
            var chora:Double = comconsumo/1000
            var conshora:String=(chora).toString()
            var consum:String=(consumocomedor).toString()
            intnsala.putExtra("consumosal", consum)
            intnsala.putExtra("usuarrii", usuarii)
            intnsala.putExtra("habitac", habita)
            intnsala.putExtra("conhora", conshora)
            startActivity(intnsala)
        }
        btnregre.setOnClickListener { finish() }
    }
}