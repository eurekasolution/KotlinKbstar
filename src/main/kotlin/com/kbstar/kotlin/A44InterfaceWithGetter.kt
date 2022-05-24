package com.kbstar.kotlin

// A44InterfaceWithGetter.kt

interface PetOne {
    var category: String
    val msg : String
        get() = "Pet message"

    fun feed()
    fun eat()
    {
        println("PetOne-> eat()")
    }
}

class CatOne(override var category: String) : PetOne{
    override fun feed() {
        println("CatOne->feed()")
    }
}

fun main() {
    var obj = CatOne("lion")
    println("Category = ${obj.category}")
    println("msg = ${obj.msg}")
    obj.feed()
    obj.eat()
}