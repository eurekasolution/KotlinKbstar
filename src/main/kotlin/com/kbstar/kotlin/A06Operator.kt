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
}