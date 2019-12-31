package com.saifi369.daggerkotlinexample.di

import com.saifi369.daggerkotlinexample.Battery
import com.saifi369.daggerkotlinexample.WetCellBattery
import dagger.Binds
import dagger.Module

@Module
interface WetCellModule {

    @Binds
    fun bindBattery(wetCellBattery: WetCellBattery): Battery

}