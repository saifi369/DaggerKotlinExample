package com.saifi369.daggerkotlinexample

import android.util.Log

class Utils {
    companion object{
        const val MY_TAG="MyTag"

        fun showTag(output:String){
            Log.d(MY_TAG,output)
        }
    }
}