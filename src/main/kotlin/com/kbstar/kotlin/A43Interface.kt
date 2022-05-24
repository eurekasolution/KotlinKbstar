package com.kbstar.kotlin

// A43Interface
/*
    Kotlin Interface : 일반 메소드가 포함된다.
 */

interface Pet {
    var category : String
    fun feed()
    fun eat()
    {
        println("Pet-> eat()")
    }
}

class Cat(override var category: String) : Pet
{
    override fun feed() {
        //TODO("Not yet implemented")
        println("Cat->feed()")
    }
}

fun main() {
    var obj = Cat("tiger")
    println("obj cate = ${obj.category}")
    obj.feed()  // 구현된 메소드
    obj.eat()   // 기본 메소드
}