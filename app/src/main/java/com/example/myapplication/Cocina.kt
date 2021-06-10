package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cocina.*

class Cocina : AppCompatActivity() {
    var consumococina:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cocina)
        var usuarii:String?= this.intent.getStringExtra("usuari")
        var habita:String?= this.intent.getStringExtra("habi")
        var ccrefri: Int = 300
        var ccestufa: Int = 100
        var ccfocobarra: Int = 200
        var ccmicro: Int = 600
        var ccelectrico: Int = 300
        var ccfoco: Int = 100
        var ccestractor: Int = 250
        if (cbcnrefri.isChecked == true) {
            consumococina = consumococina + ccrefri
            tvconsap.setText("Consumo: W")
            tvconstotal.setText("Consumo total: $consumococina W")
        }
        if (cbcnestufa.isChecked == true) {
            consumococina = consumococina + ccestufa
            tvconsap.setText("Consumo: W")
            tvconstotal.setText("Consumo total: $consumococina W")
        }
        if (cbcnfobarra.isChecked == true) {
            consumococina = consumococina + ccfocobarra
            tvconsap.setText("Consumo: W")
            tvconstotal.setText("Consumo total: $consumococina W")
        }
        if (cbcnmicroondas.isChecked == true) {
            consumococina = consumococina + ccmicro
            tvconsap.setText("Consumo: W")
            tvconstotal.setText("Consumo total: $consumococina W")
        }
        if (cbcnelectrico.isChecked == true) {
            consumococina = consumococina + ccelectrico
            tvconsap.setText("Consumo: W")
            tvconstotal.setText("Consumo total: $consumococina W")
        }
        if (cbcnfococielo.isChecked == true) {
            consumococina = consumococina + ccfoco
            tvconsap.setText("Consumo: W")
            tvconstotal.setText("Consumo total: $consumococina W")
        }
        if (cbcnestractor.isChecked == true) {
            consumococina = consumococina + ccestractor
            tvconsap.setText("Consumo: W")
            tvconstotal.setText("Consumo total: $consumococina W")
        }
        tvconsap.setText("Consumo: W")
        tvconstotal.setText("Consumo total: $consumococina W")
        cbcnrefri.setOnClickListener {
            if (cbcnrefri.isChecked == true) {
                consumococina = consumococina + ccrefri
                tvconsap.setText("Consumo: $ccrefri W")
                tvconstotal.setText("Consumo total: $consumococina W")
            }else{
                consumococina = consumococina - ccrefri
                tvconsap.setText("Consumo: W")
                tvconstotal.setText("Consumo total: $consumococina W")
            }
        }
        cbcnestufa.setOnClickListener {
            if (cbcnestufa.isChecked == true) {
                consumococina = consumococina + ccestufa
                tvconsap.setText("Consumo: $ccestufa W")
                tvconstotal.setText("Consumo total: $consumococina W")
            }else{
                consumococina = consumococina - ccestufa
                tvconsap.setText("Consumo: W")
                tvconstotal.setText("Consumo total: $consumococina W")
            }
        }
        cbcnfobarra.setOnClickListener {
            if (cbcnfobarra.isChecked == true) {
                consumococina = consumococina + ccfocobarra
                tvconsap.setText("Consumo: $ccfocobarra W")
                tvconstotal.setText("Consumo total: $consumococina W")
            }else{
                consumococina = consumococina - ccfocobarra
                tvconsap.setText("Consumo: W")
                tvconstotal.setText("Consumo total: $consumococina W")
            }
        }
        cbcnmicroondas.setOnClickListener {
            if (cbcnmicroondas.isChecked == true) {
                consumococina = consumococina + ccmicro
                tvconsap.setText("Consumo: $ccmicro W")
                tvconstotal.setText("Consumo total: $consumococina W")
            }else{
                consumococina = consumococina - ccmicro
                tvconsap.setText("Consumo: W")
                tvconstotal.setText("Consumo total: $consumococina W")
            }
        }
        cbcnelectrico.setOnClickListener {
            if (cbcnelectrico.isChecked == true) {
                consumococina = consumococina + ccmicro
                tvconsap.setText("Consumo: $ccmicro W")
                tvconstotal.setText("Consumo total: $consumococina W")
            }else{
                consumococina = consumococina - ccmicro
                tvconsap.setText("Consumo: W")
                tvconstotal.setText("Consumo total: $consumococina W")
            }
        }
        cbcnfococielo.setOnClickListener {
            if (cbcnfococielo.isChecked == true) {
                consumococina = consumococina + ccmicro
                tvconsap.setText("Consumo: $ccmicro W")
                tvconstotal.setText("Consumo total: $consumococina W")
            }else{
                consumococina = consumococina - ccmicro
                tvconsap.setText("Consumo: W")
                tvconstotal.setText("Consumo total: $consumococina W")
            }
        }
        cbcnestractor.setOnClickListener {
            if (cbcnestractor.isChecked == true) {
                consumococina = consumococina + ccmicro
                tvconsap.setText("Consumo: $ccmicro W")
                tvconstotal.setText("Consumo total: $consumococina W")
            }else{
                consumococina = consumococina - ccmicro
                tvconsap.setText("Consumo: W")
                tvconstotal.setText("Consumo total: $consumococina W")
            }
        }
        btnccdatos.setOnClickListener {
            val intnsala: Intent = Intent(this, Costo1::class.java)
            var comconsumo:Double = (consumococina).toDouble()
            var chora:Double = comconsumo/1000
            var conshora:String=(chora).toString()
            var consum:String=(consumococina).toString()
            intnsala.putExtra("consumosal", consum)
            intnsala.putExtra("usuarrii", usuarii)
            intnsala.putExtra("habitac", habita)
            intnsala.putExtra("conhora", conshora)
            startActivity(intnsala)
        }
        btnccregresar.setOnClickListener { finish() }
    }
}