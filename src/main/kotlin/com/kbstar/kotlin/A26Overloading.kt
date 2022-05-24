package com.kbstar.kotlin

// A26Overloading.kt
// 중복정의
//  signature가 다르면 중복해서 메소드를 정의할 수 있다.

class Calculator
{
    fun add(a:Int, b:Int) : Int =  a + b
    fun add(a:String, b:String) : String =  a + b
    fun add(a:String, b:Int) : String =  a + b.toString()

    fun add(a:Long, b:Long) : Long =  a + b
    fun add(a:Long, b:Int) : Long =  a + b.toLong()
    fun add(a:Int, b:Int, c:Int) : Int =  a + b + c
    fun add(a:Double, b:Double) : Double =  a + b
    fun add(a:Double, b:Int) : Double =  a + b.toDouble()

    // Signature : 리턴 타입만 다르면 시그너쳐로 인정하지 않는다.

    fun multi(a:String, b:Int) : String = a.repeat(b)
    // "Hello" * 10
}

fun main() {
    var calc = Calculator()
    var result = calc.add(1,2)

    println( calc.add(1,2))
    println( calc.add(1L,2L))
    println( calc.add(1L,2))
    println( calc.add(1.2,2))
    println( calc.add(1.1,2.2))

    var str = calc.multi("Hello", 10)
    println("str = ${str}")
}