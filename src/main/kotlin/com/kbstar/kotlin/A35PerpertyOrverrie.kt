package com.kbstar.kotlin

// A35PerpertyOverride.kt

open class First
{
    open val x: Int = 0
        get(){
            println(" i am first getter()")
            return field
        }
    val y: Int = 0
}

class Second : First()
{
    override val x: Int = 3
        get() {
            println("Second get x")
            return field * 10
        }

    // y의 getter, setter는 변경 불가능
}

fun main() {
    val second = Second()
    println(second.x)
    println(second.y)

}