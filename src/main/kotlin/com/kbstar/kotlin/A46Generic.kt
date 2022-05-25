package com.kbstar.kotlin

// A46Generic.kt

class Car<T> (_t: T )
{
    var speed = _t
}

fun main() {
    var intCar : Car<Int> = Car<Int>(1)
    var doubleCar : Car<Double> = Car<Double>(1.23)
    var stringCar : Car<String> = Car<String>("three")

    println(intCar.speed)
    println(doubleCar.speed)
    println(stringCar.speed)
}