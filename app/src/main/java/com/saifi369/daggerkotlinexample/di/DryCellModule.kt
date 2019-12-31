package com.saifi369.daggerkotlinexample.di

import com.saifi369.daggerkotlinexample.Battery
import com.saifi369.daggerkotlinexample.DryCellBattery
import dagger.Binds
import dagger.Module

@Module
interface DryCellModule {

    @Binds
    fun bindBattery(dryCellBattery: DryCellBattery): Battery

}