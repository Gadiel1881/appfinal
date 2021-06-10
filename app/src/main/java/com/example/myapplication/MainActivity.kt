package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etnombre.requestFocus()
        cbcontraseña.setOnClickListener{
            if(cbcontraseña.isChecked == true){
                etcontraseña.transformationMethod=HideReturnsTransformationMethod.getInstance()

            }else
                etcontraseña.transformationMethod=PasswordTransformationMethod.getInstance()
        }
        btnisesion.setOnClickListener{
            val intension: Intent = Intent(this, Cuarto1::class.java)
            try {
                var usu: String = etnombre.text.toString()
                var pas: Int = etcontraseña.text.toString().toInt()
                intension.putExtra("usua",usu)
                intension.putExtra("pass",pas)
                startActivity(intension)
                etnombre.setText("")
                etcontraseña.setText("")
                etnombre.requestFocus()
            } catch (mensaje: NumberFormatException) { Toast.makeText(this, "Datos de entrada incompletos...", Toast.LENGTH_SHORT).show();etnombre.requestFocus() }
        }

    }
}