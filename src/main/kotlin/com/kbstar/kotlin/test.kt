package com.kbstar.kotlin

fun test(name:String, out: Unit = println("1. I am test"))
{
    var x = println("i am x")
    println("2. test")
    out("aaa")
    println("x = ${x}")
}

fun out(msg:String)
{
    println("i am out : ${msg}")
}

fun main() {
    test("main")

}