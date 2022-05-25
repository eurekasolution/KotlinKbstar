package com.kbstar.kotlin

import java.util.*

// A47Array.kt

fun main() {
    var num1 = arrayOf(1,2,3,4,5,6,7)
    var names = arrayOf("kim","lee","park", "choi")

    println("names = " + Arrays.toString(names))
    println("names = ${Arrays.toString(names)}")

    /*
        lotto[6]
        for(int value : lotto)
     */

    for(element in names)
        println(element)

    println()

    for( x in 0..names.size -1)
        println("${x} : ${names[x]}")

    println("sum = ${num1.sum()}")
    num1.shuffle()
    println("num1 = ${Arrays.toString(num1)}")

    var intOnlyArray = arrayOf<Int>(1,2,3,4)
    var intArray = intArrayOf(1,2,3,4)

    intArray[2] = 77
    intArray.set(2, 88)
    println("intArray = ${Arrays.toString(intArray)}")

    var multiArray = arrayOf(1, "Hello",
                            arrayOf(1,2,3,4),
                            arrayOf("one", "two"))

    println(Arrays.toString(multiArray))

    //println(Arrays.toString(multiArray[2]))

    println(Arrays.deepToString(multiArray))


    var array1 = Array(5, { 1 })
    println("array1 = ${Arrays.toString(array1)}")

    var array2 = Array(5, { i -> (i +1) * 3 })
    println("array2 = ${Arrays.toString(array2)}")


    // API
    println("first = ${array2.first()}")
    println("average = ${array2.average()}")
    println("count = ${array2.count()}")

    array2 = array2.plus(5)
    println("array2 = ${Arrays.toString(array2)}")

    var array3 = array2.sliceArray(0..2)
    println("array3 = ${Arrays.toString(array3)}")

    var nullInitArray = arrayOfNulls<Int>(10)
    println("nullInitArray = ${Arrays.toString(nullInitArray)}")

}