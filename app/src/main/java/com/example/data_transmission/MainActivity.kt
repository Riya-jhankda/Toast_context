package com.example.data_transmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Apply.setOnClickListener{
            val name=et_name.text.toString()
            val age = et_age.text.toString().toInt()
            val country = et_country.text.toString()
            Intent(this,SecondActivity::class.java).also{
                it.putExtra("Extra_name",name)
                it.putExtra("Extra_age",age)
                it.putExtra("ExtraCountry",country)
                startActivity(it)

            }
        }
    }
}