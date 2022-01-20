package com.example.espressotest.Tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import com.example.espressotest.ScreenObjects.LoginScreen
import com.example.espressotest.Tests.Helpers.TestData
import com.example.espressotest.ui.login.LoginActivity
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginTests {

    @get:Rule
    public val activityRule = ActivityScenarioRule(LoginActivity::class.java)

    private val loginScreen = LoginScreen()

    @Test
    fun testFullLogin() {
        loginScreen.isDisplaying()
        loginScreen.typeUserName(TestData.signUpValues.USERNAME.value)
        loginScreen.typePassword(TestData.signUpValues.PASSWORD.value)
        loginScreen.closeSoftwareKeyboard()
        loginScreen.clickLoginButton()
    }

    @Test
    fun testPasswordTooShort() {
        loginScreen.isDisplaying()
        loginScreen.typeUserName(TestData.signUpValues.USERNAME.value)
        loginScreen.typePassword("1234")
//        loginScreen.passwordErrorMessageIsDisplaying()
//        loginScreen.closeSoftwareKeyboard()
        loginScreen.clickLoginButton()
    }
}