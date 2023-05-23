package com.example.data_transmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.getStringExtra("Extra_name")
        val age = intent.getIntExtra("Extra_age",0)
        val country=intent.getStringExtra("Extra_country")
        val personStr = "$name is $age years ols and lives in $country country with their guardians"
        tv_person.text=personStr


    }
}