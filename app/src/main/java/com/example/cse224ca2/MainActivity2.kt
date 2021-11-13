package com.example.cse224ca2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        lateinit var radioButton: RadioButton
        val radioGroup= findViewById<RadioGroup>(R.id.radioGroup)
        val out = findViewById<TextView>(R.id.out)
        val pizza= findViewById<CheckBox>(R.id.pizza1)
        val button= findViewById<Button>(R.id.submit)


        radioGroup.setOnCheckedChangeListener { radioGroup, i ->
            val setId:Int = radioGroup.checkedRadioButtonId
            radioButton = findViewById(setId)
            var out1:String= radioButton.text.toString()
            Toast.makeText(this,out1, Toast.LENGTH_SHORT).show()

        }


        pizza.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                //Do Whatever you want in isChecked
                Toast.makeText(this,"checkbox is checked", Toast.LENGTH_SHORT).show()
            }
            if (!isChecked) {
                //Do Whatever you want in isChecked
                Toast.makeText(this,"checkbox is unchecked", Toast.LENGTH_SHORT).show()
            }
        }
    }
}