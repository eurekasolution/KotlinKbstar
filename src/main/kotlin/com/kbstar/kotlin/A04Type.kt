package com.kbstar.kotlin

fun main() {
    // 변수 선언
    // val 변수이름:타입 = "값"
    /*
    자료형 추론
        var age = 12
     */
    val num = 12    // constant, Int 추론
    var lang = "Kotlin" // String 추론
    lang = "Korean";

    //num = 34  // Final, constant, read only variable

    /*
    변수 선언할 때 규칙
        불가 : 키워드 var, val, Int, class, if, for
            123test, _test (O) , __test (O)
        표기법 : 카멜표기법,

     데이터 타입
        정수형 : Int : 4 :  (-20억 ~ + 20억)
                Long : 8 : -2^63 ~ + 2^63 -1
                Short : 2 : -32000, + 32000 , 65536  ==> Port #
                Byte : 1 : -128 ~ + 127
                    age : unsinged 0 ~ 255
     */

    var numByte = 127;
    println("numByte = ${numByte} , next = ${numByte +2}")

    numByte = numByte + 1;
    println("numByte = " + numByte)

    var numLong = 123L
    var numHexa = 0x0FF
    var numBinary = 0b001010
                            // B : Byte
                            // b : bit
                            // 100MBps, 100Mbps

}