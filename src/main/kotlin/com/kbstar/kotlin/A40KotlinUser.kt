package com.kbstar.kotlin

// A40KotlinUser.kt

class A40KotlinUser {
    companion object {
        const val LEVEL = "KotlinAdmin"
        @JvmStatic fun login() = println("Login from Kotlin")
    }
}