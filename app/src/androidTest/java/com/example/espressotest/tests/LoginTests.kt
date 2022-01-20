package com.example.espressotest.tests

import com.example.espressotest.tests.helpers.TestData.signUpValues.USERNAME
import com.example.espressotest.tests.helpers.TestData.signUpValues.PASSWORD
import com.example.espressotest.tests.helpers.TestData.signUpValues.INVALID_PASSWORD
import com.example.espressotest.tests.helpers.TestData.signUpValues.INVALID_USERNAME
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import com.example.espressotest.screenObjects.LoginScreen
import com.example.espressotest.ui.login.LoginActivity
import org.junit.Test

class LoginTests {

    @get:Rule
    public val activityRule = ActivityScenarioRule(LoginActivity::class.java)

    private val loginScreen = LoginScreen()

    @Test
    fun testFullLogin() {
        loginScreen.apply {
            isDisplaying()
            typeUserName(USERNAME.value)
            typePassword(PASSWORD.value)
            clickLoginButton()
        }
    }

    @Test
    fun testPasswordTooShort() {
        loginScreen.apply {
            isDisplaying()
            typeUserName(USERNAME.value)
            typePassword(INVALID_PASSWORD.value)
            passwordIsInvalid()
        }
    }

    @Test
    fun testInvalidUserName() {
        loginScreen.apply {
            isDisplaying()
            typeUserName(INVALID_USERNAME.value)
            usernameIsInvalid()
        }
    }
}