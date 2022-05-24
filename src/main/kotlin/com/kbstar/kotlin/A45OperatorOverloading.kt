package com.kbstar.kotlin

// A45OperatorOverloading.kt
/*
    a + b   <------> a.plus(b)
 */

class Point(var x: Int = 0, var y: Int = 0)
{
    operator fun plus(p:Point) : Point {
        return  Point(x + p.x, y + p.y )
    }

    override fun toString(): String {
        return "Point(x=$x, y=$y)"
    }


}

fun main() {
    val p1 = Point(1, 2)
    val p2 = Point(10, 20)

    var point = Point()
    point = p1 + p2
    println(point)
    point = p1.plus(p2)
    println(point)
}