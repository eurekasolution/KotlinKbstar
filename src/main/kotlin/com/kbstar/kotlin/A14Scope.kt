package com.kbstar.kotlin


// 최상위 함수
fun a() = println("i am a")
fun b() = a()
fun c() {
    println("i am c")

    fun c1() = println("i am c1")

}

var globalVariable = 10
// var gEmployeeCount
/*
    prefix  :KbAuthAAAAA

    var iNumber : Int
    var dPoint : Double

 */

fun main() {

    a();
    b();
    //c1()
    c()

    var local1 = 11
    var local2 = 22

    println("gv = ${globalVariable}") //10

    fun nestedFun()
    {
        globalVariable ++ // 11

        var local1 = 33

        println("local1 = ${local1}, local2 = ${local2}")   // 33 22

    }

    nestedFun()
    println("local1 = ${local1}, local2 = ${local2} , gv = ${globalVariable}") // 11 22 11

    outsideFun()
    println("local1 = ${local1}, local2 = ${local2} , gv = ${globalVariable}") // 11 22 333
}

fun outsideFun()
{
    var local1 = 111
    var local2 = 222
    globalVariable = 333
    println("i am outsideFun")
    println("local1 = ${local1}, local2 = ${local2} , gv = ${globalVariable}")

}