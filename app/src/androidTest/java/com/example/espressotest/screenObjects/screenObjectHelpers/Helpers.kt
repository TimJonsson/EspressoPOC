package com.example.espressotest.screenObjects.screenObjectHelpers

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers

open class ScreenObjectHelpers {

    fun closeSoftwareKeyboard() {
        Espresso.onView(ViewMatchers.isRoot()).perform(ViewActions.closeSoftKeyboard())
    }
}