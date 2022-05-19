package com.kbstar.kotlin

fun main() {
    /*
        Operator
        산술연산자 : + - * / %
        대입연산자 : =, +=, -=, *=, /= , %=
        증감연산자 : ++, --
                    a++, --a
                    a = 3
                                   출력       a 값
                    println(a++)   3        4
                    println(a)     4
                    println(--a)   3        3
                    println(a)     3
     */

    var num1 = 10
    var num2 = 10
    var result1 = ++num1;
    var result2 = num2--;

    println("result1 = ${result1}  , ${num1}")
    println("result2 = ${result2}, ${num2}")

    /*
        비교연산자
            >, <, >=, <=, ==, ===, !=, !==
        논리연산자 (if 속에 들어가는 연산)
            &&, ||, !
        비트연산자
            4.shl(2), 7.shr(2), 9.and(3)

     */

    var x = 4   // 100
    var y = 0b0000_1010 // 10
    var z = 0x0F    // 0000 1111

    println("x shl 2 = ${x shl 2}")
    println("x.inv() = ${x.inv()}")
    // 0000 0000   0000 0000   0000 0000   0000 0100
    // 1111 1111   1111 1111   1111 1111   1111 1011

    println("y shr 2 = ${y shr 2}   or ${y/4}")
    println("y shl 4 = ${y shl 4}  or ${ y * 16}")

    var k = x.shl(3)

    num1 = 12
    num2 = 25
    var result :Int

    result = num1 or num2  // num1 | num2
    println("result = ${result}")

    // 01100
    // 11001
    // 11101 : 29


}