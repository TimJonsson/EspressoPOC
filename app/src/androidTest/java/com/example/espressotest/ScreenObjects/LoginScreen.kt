package com.example.espressotest.ScreenObjects

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.espressotest.R

class LoginScreen {

    private val loginEditText = onView(withId(R.id.username))
    private val passwordEditText = onView(withId(R.id.password))
    private val loginButton = onView(withId(R.id.login))
    private val passwordErrorMessage = onView(withText("Password must be >5 characters"))

    fun isDisplaying() {
        loginEditText.check(matches(isDisplayed()))
        passwordEditText.check(matches(isDisplayed()))
        loginButton.check(matches(isDisplayed()))
    }

    fun typeUserName(username: String) {
        loginEditText.perform(typeText(username))
    }

    fun typePassword(password: String) {
        passwordEditText.perform(typeText((password)))
    }

    fun clickLoginButton() {
        loginButton.perform(click())
    }

    fun closeSoftwareKeyboard() {
        onView(ViewMatchers.isRoot()).perform(ViewActions.closeSoftKeyboard())
    }

    fun passwordErrorMessageIsDisplaying() {
        passwordErrorMessage.check(matches(isDisplayed()))
    }
}