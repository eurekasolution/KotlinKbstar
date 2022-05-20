package com.kbstar.kotlin

// Call By Name(함수)
// Function Pointer 로 호출


/*
Javascript:

    function myFunc(name)
    {
        let x = .....
    }
 */
fun main() {
    val result = callByName(myFunc)
}

fun callByName( b: () -> Boolean ) : Boolean {
    println("I am callByName()")
    return b()
}

val myFunc: () -> Boolean = {
    println("I am myFunc()")
    true
}