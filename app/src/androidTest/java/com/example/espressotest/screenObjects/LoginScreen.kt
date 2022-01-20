package com.example.espressotest.screenObjects

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.espressotest.R
import com.example.espressotest.screenObjects.screenObjectHelpers.ScreenObjectHelpers

class LoginScreen: ScreenObjectHelpers() {

    private val usernameEditText = onView(withId(R.id.username))
    private val passwordEditText = onView(withId(R.id.password))
    private val loginButton = onView(withId(R.id.login))

    fun isDisplaying() {
        usernameEditText.check(matches(isDisplayed()))
        passwordEditText.check(matches(isDisplayed()))
        loginButton.check(matches(isDisplayed()))
    }

    fun typeUserName(username: String) {
        usernameEditText.perform(typeText(username))
    }

    fun typePassword(password: String) {
        passwordEditText.perform(typeText((password)))
        closeSoftwareKeyboard()
    }

    fun passwordIsInvalid() {
        passwordEditText.check(matches(hasErrorText("Password must be >5 characters")));
    }

    fun usernameIsInvalid() {
        usernameEditText.check(matches(hasErrorText("Not a valid username")));
    }

    fun clickLoginButton() {
        loginButton.perform(click())
    }
}