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
        var valor3 = false

        // Operador de negación ! hace que se niegue la variable valor3 que tiene un valor de false haciendola
        // true y permitiendo realizar la operación dentro del if
        if(!valor3){
            valor1 %= valor2
        }
         //Se reasigna valores a la variables
        valor1 = 7
        valor3 = true

        // Operador de negación ! hace que se niegue la variable valor3 que tiene un valor de true haciendola
        // false no permitiendo realizar la operación dentro del if
        if(!valor3){
            valor1 %= valor2
        }

        valor1 = 7
        valor3 = false

        // Sobrecarga de operador de negación hace que se niegue la variable valor3 que tiene un valor de false
        // haciendola true permitiendo realizar la operación dentro del if
        if(valor3.not()){
            valor1 %= valor2
        }


        // Operadores de igualdad y desigualdad
        // Operador de igualdad

        valor3 = valor1 == valor2 // Es el operador de igualdad tradicional
        valor1 = 7
        valor2 = 3
        valor3 = false

        //Sobrecarga del operador de igualdad
        valor3 = valor1?.equals(valor2) ?: (valor2==null) //Se evalua false al no ser iguales
        // valor1 y valor2 y se asigna a valor3

        valor1 = 7
        valor2 = 7
        valor3 = false
        valor3 = valor1?.equals(valor2) ?: (valor2==null) //Se evalua true al ser iguales
        // valor1 y valor2  y se asigna a valor3

        // El código del siguiente bloque comentado provoca un error ya que se esta comparando
        // un dato de tipo string con un dato de tipo enetero
       /*
            var valor4 = null
            valor2 = 7
            valor3 = false
            valor3 = valor4?.equals(valor2) ?: (valor2==null)
       */

        var valor4 = null
        var valor5 = "Manuel"
        valor3 = false
        valor3 = valor4?.equals(valor5) ?: (valor5==null) //Se evalua false al no ser iguales
        // valor4 y valor5 y se asigna a valor3


        //Operador de desigualdad

        //valor4 != valor5 operador de desigualdad tradicional

        valor3 = valor4!=valor5//Se evalua true al ser diferentes valor4 y valor5 y se almacena en valor3

        valor3 = false
        valor1 = 7
        valor5 = "Manuel"

        //Sobrecarga del operador desigualdad

        valor3 = !(valor1?.equals(valor5) ?: (valor5==null)) // Se evalua true al ser distintos
        // valor1 y valor5 y se asigna a valor3

        var valor6 = null
        valor3 = !(valor6?.equals(valor5) ?: (valor5 ==null)) // Se evalua true al ser distintos
        // valor6 y valor5 y se asigna a valor3


        var valor8 = "Manuel"
        valor3 = !(valor8?.equals(valor5) ?: (valor5 ==null)) // Se evalua false al no ser distinos
        // valor8 y valor5

        /*name = editName?.text.toString()
        age = editAge?.text.toString()

        if (name != "") textName?.text = name
        if (age != "") textAge?.text = age*/

    }
}
