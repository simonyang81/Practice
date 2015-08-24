package com.simon.practice_android

/**
 * Created by simon on 8/18/15.
 */

class SingletonClass {

    companion object {
        fun getInstance() = SingletonClass()
    }

    fun getName() : String = "---> My name is Simon..."

}

