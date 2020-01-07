package com.saifi369.daggerkotlinexample

import javax.inject.Inject

class DryCellBattery : Battery {

    val voltage: Double

    @Inject
    constructor(voltage: Double) {
        this.voltage = voltage
    }

    override fun ignite() {
        Utils.showTag("DryCell Battery is ready, voltage, $voltage")
    }
}