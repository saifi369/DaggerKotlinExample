package com.saifi369.daggerkotlinexample.di

import com.saifi369.daggerkotlinexample.CrankShaft
import com.saifi369.daggerkotlinexample.Engine
import com.saifi369.daggerkotlinexample.Piston
import com.saifi369.daggerkotlinexample.PistonRings
import dagger.Module
import dagger.Provides

@Module
object EngineModule {

    @Provides
    @JvmStatic
    fun provideCrankShaft(): CrankShaft {
        return CrankShaft()
    }

    @Provides
    @JvmStatic
    fun providePistonRings(): PistonRings {
        return PistonRings()
    }

    @Provides
    @JvmStatic
    fun providePistonPiston(pistonRings: PistonRings): Piston {
        val piston = Piston(pistonRings)
        piston.sealPiston()
        return piston
    }

    @Provides
    @JvmStatic
    fun provideEngine(piston: Piston, crankShaft: CrankShaft): Engine {
        return Engine(piston, crankShaft)
    }


}