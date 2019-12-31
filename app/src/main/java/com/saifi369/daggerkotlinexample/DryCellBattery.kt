package com.saifi369.daggerkotlinexample

import javax.inject.Inject

class DryCellBattery : Battery {

    @Inject
    constructor()

    override fun ignite() {
        Utils.showTag("DryCell Battery is ready")
    }
}