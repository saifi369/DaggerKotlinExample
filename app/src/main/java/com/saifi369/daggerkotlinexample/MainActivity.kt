package com.saifi369.daggerkotlinexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.saifi369.daggerkotlinexample.R.layout.activity_main
import com.saifi369.daggerkotlinexample.di.DaggerCarInjector

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        val hondaCar = DaggerCarInjector.create().getCar()

        hondaCar.drive()
    }
}
