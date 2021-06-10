package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lavanderia.*

class Lavanderia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var consumolavanderia:Int=0
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lavanderia)
        var usuarii:String?= this.intent.getStringExtra("usuari")
        var habita:String?= this.intent.getStringExtra("habi")
        var clabanico: Int = 300
        var cllavadora: Int = 100
        var clsecadora: Int = 200
        var clfocosafuera: Int = 600
        if (cblabanico.isChecked == true) {
            consumolavanderia = consumolavanderia + clabanico
            tvconsap.setText("Consumo: W")
            tvconstotal.setText("Consumo total: $consumolavanderia W")
        }
        if (cbllavadora.isChecked == true) {
            consumolavanderia = consumolavanderia + cllavadora
            tvconsap.setText("Consumo: W")
            tvconstotal.setText("Consumo total: $consumolavanderia W")
        }
        if (cblsec.isChecked == true) {
            consumolavanderia = consumolavanderia + clsecadora
            tvconsap.setText("Consumo: W")
            tvconstotal.setText("Consumo total: $consumolavanderia W")
        }
        if (cblfocos.isChecked == true) {
            consumolavanderia = consumolavanderia + clfocosafuera
            tvconsap.setText("Consumo: W")
            tvconstotal.setText("Consumo total: $consumolavanderia W")
        }
        tvconsap.setText("Consumo: W")
        tvconstotal.setText("Consumo total: $consumolavanderia W")
        cblabanico.setOnClickListener {
            if (cblabanico.isChecked == true) {
                consumolavanderia = consumolavanderia + clabanico
                tvconsap.setText("Consumo: $clabanico W")
                tvconstotal.setText("Consumo total: $consumolavanderia W")
            }else{
                consumolavanderia = consumolavanderia - clabanico
                tvconsap.setText("Consumo: W")
                tvconstotal.setText("Consumo total: $consumolavanderia W")
            }
        }
        cbllavadora.setOnClickListener {
            if (cbllavadora.isChecked == true) {
                consumolavanderia = consumolavanderia + cllavadora
                tvconsap.setText("Consumo: $cllavadora W")
                tvconstotal.setText("Consumo total: $consumolavanderia W")
            }else{
                consumolavanderia = consumolavanderia - cllavadora
                tvconsap.setText("Consumo: W")
                tvconstotal.setText("Consumo total: $consumolavanderia W")
            }
        }
        cblsec.setOnClickListener {
            if (cblsec.isChecked == true) {
                consumolavanderia = consumolavanderia + clsecadora
                tvconsap.setText("Consumo: $clsecadora W")
                tvconstotal.setText("Consumo total: $consumolavanderia W")
            }else{
                consumolavanderia = consumolavanderia - clsecadora
                tvconsap.setText("Consumo: W")
                tvconstotal.setText("Consumo total: $consumolavanderia W")
            }
        }
        cblfocos.setOnClickListener {
            if (cblfocos.isChecked == true) {
                consumolavanderia = consumolavanderia + clfocosafuera
                tvconsap.setText("Consumo: $clfocosafuera W")
                tvconstotal.setText("Consumo total: $consumolavanderia W")
            }else{
                consumolavanderia = consumolavanderia - clfocosafuera
                tvconsap.setText("Consumo: W")
                tvconstotal.setText("Consumo total: $consumolavanderia W")
            }
        }
        btnldatos.setOnClickListener {
            val intnsala: Intent = Intent(this, Costo1::class.java)
            var comconsumo:Double = (consumolavanderia).toDouble()
            var chora:Double = comconsumo/1000
            var conshora:String=(chora).toString()
            var consum:String=(consumolavanderia).toString()
            intnsala.putExtra("consumosal", consum)
            intnsala.putExtra("usuarrii", usuarii)
            intnsala.putExtra("habitac", habita)
            intnsala.putExtra("conhora", conshora)
            startActivity(intnsala)
        }
        btnlregresar.setOnClickListener { finish() }
    }
}