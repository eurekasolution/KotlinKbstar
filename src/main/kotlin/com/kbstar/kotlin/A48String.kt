package com.kbstar.kotlin

// A48String.kt

fun main() {
    val hello : String = "Hello Kotlin World"
    println("hello = ${hello}")
    println("length = ${hello.length}")

    // hello[0] =
    for(x in 0..hello.length -1)
        println("hello[${x}] = ${hello[x]}")

    var str = "HelloWorld"
    println("substr =  ${str.substring(0..3)}")

    var str1 = "Aello"
    var str2 = "Aello"
    println(str1.compareTo(str2))

    var str3 = "Hello"
    // str3[1] = 'A'

    var str4 = java.lang.StringBuilder("Hello")
    str4[1] = 'A'
    println(str4)

    str4.append("Kotlin")
    println("${str4}")
    str4.insert(2, "XYZ")
    println("${str4}")

    str4.delete(1,3)

    // Java StringTokenizer
    var str5 = "C,C++,Java,Python,HTML,JS,Spring,Kotlin"
    var lang = str5.split(",")
    println(lang)

    for(x in 0..lang.count() -1)
        println("${lang[x]}")

    var str6 = "1234567"

    var num6 : Int = str6.toInt()
    num6 ++

    println("num6 = ${num6}")


    // I'm a "KBstar" Banker
    var job = "I'm a \"KBstar\" Banker"
    println(job)

    var intro = """
        kbstar
        hong kildong
        20 years old
    """.trimIndent()
    println(intro)

    var intro2 = """
        | aaa
        | bbb
        | ccc
        | ddd   
    """.trimMargin()
    println(intro2)
}