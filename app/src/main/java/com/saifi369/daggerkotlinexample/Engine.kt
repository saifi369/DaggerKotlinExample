package com.saifi369.daggerkotlinexample

import javax.inject.Inject

class Engine @Inject constructor() {

    fun start(){
        Utils.showTag("Engine has started")
    }

}