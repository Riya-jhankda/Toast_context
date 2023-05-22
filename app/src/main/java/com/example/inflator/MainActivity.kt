package com.example.inflator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast
import kotlinx.android.synthetic.main.toast.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_st.setOnClickListener{
            Toast(this).apply {
                duration=Toast.LENGTH_LONG
                view = layoutInflater.inflate(R.layout.toast,toast_mssg)
                show()
            }
        }


    }
}