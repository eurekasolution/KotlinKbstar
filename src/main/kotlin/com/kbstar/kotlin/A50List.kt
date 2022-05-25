package com.kbstar.kotlin

fun main() {

    var langs : ArrayList<String> = arrayListOf<String>("HTML", "JS", "PYTHON", "KOTLIN")
    println("langs = ${langs}")

    langs[1] = "JavaScript"
    langs.add("C")
    println("langs = ${langs.toString()}")


    var names : List<String> = listOf("kim", "lee", "park", "choi")
    //names[1] = "aaa"
    //names.add()

    var mutableList: MutableList<String> = mutableListOf<String>("aaa","bbb", "ccc")

    mutableList[0] = "AAA"
    mutableList.add("ddd")
    mutableList.remove("bbb")   // xxx 일때는 무시
    println("mutableList = ${mutableList}")

    var list  = names.toMutableList()
    list.add("kkk")
    println("list = ${list}")

    names = names.toMutableList()
    names[1] = "AAAA"
    names.add("mmm")
    names.add("nnn")
    println("names = ${names}")

}