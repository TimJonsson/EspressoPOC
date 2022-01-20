package com.example.espressotest.tests.helpers

class TestData {

    enum class signUpValues(val value: String) {
        USERNAME("Test username"),
        PASSWORD("Test password"),
        INVALID_PASSWORD("12456"),
        INVALID_USERNAME("test@test")
    }
}