package com.kbstar.kotlin


var globals = 1

fun main() {
    var a = 1
    var b = 2

    println("a${globals}") 			// A        0 1 2 3    // 1
    fun inner() {
        var a=10
        a ++
        globals ++
        println("b${a}")		// B     1 2 10 11   // 11
    }
    inner()
    outter()
    println("c${a} ") 		            	// C      1 2 3 4     // 1
    println("d${globals}")                         	// D       1 2 3 4    // 4
}
fun outter()
{
    var a = 1

    a++
    globals ++
    println("e${a}")			// E	1 2 3 4   // 2
}