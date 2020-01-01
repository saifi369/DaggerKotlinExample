package com.saifi369.daggerkotlinexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.saifi369.daggerkotlinexample.R.layout.activity_main
import com.saifi369.daggerkotlinexample.di.DaggerCarInjector
import com.saifi369.daggerkotlinexample.di.DryCellModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var hondaCar: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        DaggerCarInjector.builder()
            .dryCellModule(DryCellModule(12.6))
            .build()
            .injectFields(this)

        hondaCar.drive()
    }
}
