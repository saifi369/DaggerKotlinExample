package com.saifi369.daggerkotlinexample.di

import com.saifi369.daggerkotlinexample.Car
import com.saifi369.daggerkotlinexample.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [EngineModule::class, DryCellModule::class])
interface CarInjector {

    fun getCar(): Car

    fun injectFields(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        fun build(): CarInjector

        @BindsInstance
        fun setBatteryVoltage(voltage: Double): Builder

    }

}