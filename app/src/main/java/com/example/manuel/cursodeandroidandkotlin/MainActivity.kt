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

        //Las siguientes declaraciones reportan un error por redundancia de declaracion de tipo por lo que se declaran como
        //se muestra en el código despues del bloque comentado.

        /*
        var cadena: String = ""
        var entero: Int = 0
        var doble: Double = 5.0
        var valor: Boolean = false
        var char: Char = 'k'
        var f: Float = 5.2f
        */

        //Las siguientes declaraciones hacen que el compilador infiera el tipo de dato de las variables

        var cadena = "" //Dato tipo cadena (String)
        var entero = 0  //Dato tipo  (Int)
        var doble = 5.0 //Dato tipo doble (Double)
        var valor = false //Dato tipo booleano (Boolean)
        var char = 'k' //Dato tipo caracter (Char)
        var f = 5.2f //Dato tipo flotante (Float)

        /*name = editName?.text.toString()
        age = editAge?.text.toString()

        if (name != "") textName?.text = name
        if (age != "") textAge?.text = age*/

    }
}
