package com.saifi369.daggerkotlinexample.di

import com.saifi369.daggerkotlinexample.Car
import dagger.Component

@Component
interface CarInjector {

    fun getCar(): Car

}