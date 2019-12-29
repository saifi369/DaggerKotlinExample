package com.saifi369.daggerkotlinexample.di

import com.saifi369.daggerkotlinexample.Car
import com.saifi369.daggerkotlinexample.MainActivity
import dagger.Component

@Component(modules = [EngineModule::class])
interface CarInjector {

    fun getCar(): Car

    fun injectFields(mainActivity: MainActivity)

}