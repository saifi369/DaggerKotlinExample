package com.saifi369.daggerkotlinexample.di

import com.saifi369.daggerkotlinexample.Battery
import com.saifi369.daggerkotlinexample.DryCellBattery
import dagger.Module
import dagger.Provides

@Module
class DryCellModule {

//    private val voltage: Double
//
//    constructor(voltage: Double) {
//        this.voltage = voltage
//    }

    @Provides
    fun provideBattery(dryCellBattery: DryCellBattery): Battery {
        return dryCellBattery
    }


}