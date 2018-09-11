package com.example.manuel.cursodeandroidandkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), TextWatcher {
    override fun afterTextChanged(s: Editable?) {

    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        Toast.makeText(this, s.toString(), Toast.LENGTH_SHORT).show()
    }

    private var editName: EditText? = null
    private var editAge: EditText? = null
    private var name: String? = null
    private var age = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editName = findViewById(R.id.editText_Name)
        editAge = findViewById(R.id.editText_Age)

        editName?.addTextChangedListener(this)
        editAge?.addTextChangedListener(this)

    }
}
