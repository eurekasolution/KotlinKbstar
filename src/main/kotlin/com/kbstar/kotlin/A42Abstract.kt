package com.kbstar.kotlin

// A42Abstract.kt

abstract class Printer
{
    abstract fun print();
    fun test(){
        println("i am test()")
    }
}

val myPrinter = object:Printer()
{
    override fun print() {
        //TODO("Not yet implemented")
        println("i am myPrinter()")
    }
}

fun main() {
    myPrinter.print()
    myPrinter.test()

    //var print = Printer()

}