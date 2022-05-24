package com.kbstar.kotlin

// A27Overriding.kt

open class CarOne(var name:String, var color:String)
{
    open fun start() = println("Engine Start")
    fun stop() = println("Engine Stop")
}

class SportsCar(name:String, color:String, turbo:Boolean) : CarOne(name, color)
{
    fun speedUp() = println("Speed Up")

    // @Override
    override fun start() {
        super.start()
        println("new start()")
    }
}

fun main() {
    var taxi = CarOne("taxi", "yellow")
    var bmw = SportsCar("bmw", "red", true)
    bmw.start()
    bmw.stop()
}