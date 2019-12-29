package com.saifi369.daggerkotlinexample

import javax.inject.Inject

class LicensePlate {

    @Inject
    constructor()

    fun attachToCar(car: Car) {
        Utils.showTag("License plate is attached")
    }

}