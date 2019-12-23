package com.saifi369.daggerkotlinexample

class Car (var engine: Engine,
           var battery: Battery) {

    fun drive() {
        battery.ignite()
        engine.start()
        Utils.showTag("Vhrooom! Car is driving")
    }

}