package com.example.manuel.cursodeandroidandkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), TextWatcher, View.OnClickListener {
    override fun onClick(v: View?) {
        operacion()
    }

    override fun afterTextChanged(s: Editable?) {

    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

    }

    private var editName: EditText? = null
    private var editAge: EditText? = null
    private var textName: TextView? = null
    private var textAge: TextView?= null
    private var button: Button?= null


    private var name: String? = null
    private var age: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        operacion()
        //editName = findViewById(R.id.editText_Name) as EditText
        editName = findViewById(R.id.editText_Name)
        editAge = findViewById(R.id.editText_Age)

        textName = findViewById(R.id.textView_Name)
        textAge = findViewById(R.id.textView_Age)
        button = findViewById(R.id.button_Ejecutar)
        button!!.setOnClickListener(this)
        editName!!.addTextChangedListener(this)
        editAge!!.addTextChangedListener(this)

    }

    private fun operacion(){

        var entero = 0  //Dato tipo  (Int)
        var valor1 = 7
        var valor2 = 3
        //oerador de Incremento
        valor1++


        valor1 = 7
        //Sobrecarga del operador incremento
        valor1 = valor1.inc()

        valor1 = 7
        //oerador de Decremento
        valor1--

        valor1 = 7
        //Sobrecarga del operador decremento
        valor1 = valor1.dec()


        //En las siguientes lineas de codigo se muestran operadores de asignación aumentada
        valor1 = 7
        valor2 = 3
        valor2 += valor1 //Almacena en valor2 la suma de valor2 con valor1

        valor1 = 7
        valor2 = 3
        valor2 -= valor1 //Almacena en valor2 la resta de valor2 con valor1

        valor1 = 7
        valor2 = 3
        valor2 *= valor1 //Almacena en valor2 la multiplicación de valor2 con valor1

        valor1 = 7
        valor2 = 3
        valor1 %= valor2 //Almacena en valor1 el resto de división de valor1 con valor2


        /*name = editName?.text.toString()
        age = editAge?.text.toString()

        if (name != "") textName?.text = name
        if (age != "") textAge?.text = age*/

    }
}
