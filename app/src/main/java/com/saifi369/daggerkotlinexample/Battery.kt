package com.saifi369.daggerkotlinexample

import javax.inject.Inject

class Battery @Inject constructor() {
    fun ignite(){
        Utils.showTag("Battery is ready")
    }
}