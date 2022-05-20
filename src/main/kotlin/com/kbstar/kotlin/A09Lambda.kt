package com.kbstar.kotlin

//  A09Lambda.kt
fun main() {
    // 변수에 람다식을 활용

    var result:Int

    // 생략되는 원래 전체 표현
    var sum1 : (Int, Int) -> Int = { a:Int, b:Int -> a + b}

    // 선언 자료형 생략
    var sum2 = { a:Int, b:Int -> a + b}

    // 람다식의 매개변수 자료형 생략략
    var sum3 : (Int , Int) -> Int = {a, b -> a + b}
    var total = add3(10, 20)

    println("sum2 = ${sum2}")

    // var sum1 : (Int, Int) -> Int = { a:Int, b:Int -> a + b}
    // 파라미터 없는 경우
    val greet: () -> Unit = { println("Hello ~~")}
    // 파라미터 1개인경우
    val squre : (Int) -> Int = { a -> a * a}

    // 형식
    // ( 타입1, 타입2, ...) -> 리턴타입 = { 변수1, 변수2 , .. -> 동작(리턴)  }

    result = test( { a, b -> a + b}, 2, 3)
    println("result = ${result}")

    val greet1: () -> Unit = { println("Hello ~~")}
    println("greet = ${greet1}")
    greet1()


    val testOutput : () -> Unit = { println("function pointer test")}
    val testInput : () -> Unit = { println("function pointer input test")}

    val adder : (Int, Int) -> Int = {a:Int, b:Int ->  a + b }
    val subtractor : (Int, Int) -> Int = {a:Int, b:Int ->  a - b }
    val multiplier : (Int, Int) -> Int = {a:Int, b:Int ->  a * b }
    val divider : (Int, Int) -> Int = {a:Int, b:Int ->  a / b }

    testOutput()

    var functionPointer = testOutput
    functionPointer()

    functionPointer = testInput
    functionPointer()

    var operator = adder
    println("+ " + operator(4, 2))
    operator = subtractor
    println("- " + operator(4, 2))
    operator = multiplier
    println("* " + operator(4, 2))
    operator = divider
    println("/ " + operator(4, 2))

}

// test : param count 3
                //             // 2     3
fun test( xxx: (Int, Int) -> Int , a:Int, b:Int): Int
{
    println("xxxx = " + xxx(a, b))
    return myAdd(a, b) +  a + b
}

fun myAdd(a:Int, b:Int) = a + b +1

fun add3(a:Int, b:Int) = a * b
