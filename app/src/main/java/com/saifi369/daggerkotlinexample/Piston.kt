package com.saifi369.daggerkotlinexample

class Piston(val pistonRings: PistonRings) {

    //this class is not part of our own code
    //this class is from third party library
    //so we cannot change any code in this class

    fun sealPiston() {
        Utils.showTag("Piston is sealed")
    }

}