package com.kbstar.kotlin

fun traceTest(name:String, out:Unit = println("AAA"))
{
    var age = 20
    age ++
    var check = println("BBB")
    println("CCC")
}

fun main() {
    traceTest("kim")
    println("DDD")
}