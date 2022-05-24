package com.kbstar.kotlin

// A30FunctionCall.kt

fun general(name:String)
{
    println("general() : name = ${name}")
}

fun trace(name:String, myout:Unit = println("1. trace()"))
{
    var age = 20
    age ++
    var check = println("2. check ...")

    println("check = ${check.toString()}")

    //println("2. trace() is called")
}

fun main() {
    general("hong")
    trace("kim")
}