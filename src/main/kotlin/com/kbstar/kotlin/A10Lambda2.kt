package com.kbstar.kotlin

// Call By Value
/*
    void printCar(Car obj)
    {

    }

    main()
    {
        Car taxi = new Car();

        printCar(taxi)
    }


 */

fun test2(value:Int)
{
    println("param value = ${value}")
}

fun callByValue(b: Boolean) : Boolean
{
    println("i am callByValue()")
    return b
}

val myTest: ()-> Boolean = {
    println("i am myTest()")
    true
}

fun main() {
    test2(12)

    val result = callByValue(  myTest() )


}