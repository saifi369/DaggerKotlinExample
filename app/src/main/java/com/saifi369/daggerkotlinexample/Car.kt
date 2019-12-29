package com.saifi369.daggerkotlinexample

import javax.inject.Inject

class Car @Inject constructor(
    var engine: Engine,
    var battery: Battery
) {

    fun drive() {
        battery.ignite()
        engine.start()
        Utils.showTag("Vhrooom! Car is driving")
    }

    @Inject
    fun attachToLicensePlate(licensePlate: LicensePlate) {
        licensePlate.attachToCar(this)
    }

}