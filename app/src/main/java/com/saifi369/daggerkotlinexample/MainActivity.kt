package com.saifi369.daggerkotlinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.saifi369.daggerkotlinexample.R.layout.activity_main

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        var engine:Engine= Engine()
        var battery:Battery=Battery()

        val hondaCar=Car(engine,battery)

        hondaCar.drive()
    }
}
