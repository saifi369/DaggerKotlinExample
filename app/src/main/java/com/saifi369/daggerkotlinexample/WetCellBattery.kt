package com.saifi369.daggerkotlinexample

import javax.inject.Inject

class WetCellBattery : Battery {

    @Inject
    constructor()

    override fun ignite() {
        Utils.showTag("WetCell Battery is ready")
    }
}