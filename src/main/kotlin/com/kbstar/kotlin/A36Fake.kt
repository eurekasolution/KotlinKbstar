package com.kbstar.kotlin

// A36Fake.kt
/*
    나이를 가지고 Fake
    < 18 : 18
    18~30 : 실제나이
    30> : 나이 - 3

 */

class FakeAge
{
    var age: Int = 0
        set(value) {
            field = when {
                value < 18 -> 18
                value in 18..30 -> value
                else -> value -3
            }
        }
}

fun main() {
    val kim = FakeAge()
    kim.age = 15
    println("Real Age = 15, fake age = ${kim.age}")

    kim.age = 25
    println("Real Age = 25, fake age = ${kim.age}")

    kim.age = 31
    println("Real Age = 31, fake age = ${kim.age}")

}