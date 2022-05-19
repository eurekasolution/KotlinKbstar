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

    /*
    Unsigned
    010101010100101010010

        UInt , UShort, ULong, UByte
     */

    val uint : UInt = 123u;
    val ushort : UShort = 65535u
    val ulong : ULong = 123uL

    /*
    UnderScore
    1,234,567
    1_234_567
     */

    val million = 1_000_000   // 1000000
    val cardNum = 1234_5678_9012_3456L
    val hexa = 0xAB_CD_EF_12
    val bytes = 0b1010_1100

    println("hexa = ${hexa}")

    /*
    부동소수점 : Float(4B, 10^38), Double(8B, 10^308)
                Float : signed(1b), 지수(8b), 가수(23b)
                Double(1, 11b, 52b)

                pi = 3.1415927
     */

    val num01 = 3.14;  // Double
    val num02 = 3.14F; // Float

    println("num02 = ${num02}")
    val num03 = 3.14E-2;
    val num04 = 3.14e+2;

    println("num03 = ${num03}")
    println("num04 = ${num04}")

    /* 반복문 미리보기 */

    var sum: Double = 0.1
    for(x in 1..100)
    {
        println(x)
        sum += 0.1
    }

    println("sum = ${sum}")

    println("Max Int = " + Int.MAX_VALUE)
    println("Min Byte = " + Byte.MIN_VALUE)
    println("Max UInt = " + UInt.MAX_VALUE)
    println("MAX Double = " + Double.MAX_VALUE)

    /*
    논리형 : Boolean true/false
     */
    val isOn = false  //
    val isOff = true

    var isOK : Boolean
    println("isOn = ${isOn}")

    /*
    문자형 : Char
     */

    val initial = 'K'
    var myChar:Char

    myChar = 'M'
    myChar = '\uAC03'

    println("myChar = ${myChar}")



}