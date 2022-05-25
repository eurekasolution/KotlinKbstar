package com.kbstar.kotlin

// A52Map.kt
/*
    Map : 대용량 데이터 처리할 때 유용
        key, value의 쌍으로 처리
        Dictionary Type
        배열(연관배열, Associcative Array)
        Immutable 불변형
 */

fun main() {
    var langMap : Map<Int, String> = mapOf(1 to "Java", 2 to "Kotlin", 3 to "Python")
    println("langMap = ${langMap}")
    println(langMap[2])

    for( (key, value) in langMap)
        println("key : $key , value : $value")

    var protocol : Map<String, String> = mapOf("tcp" to "Transmission Control Protocol",
                                                "udp" to "User Datagram Protocol",
                                                "http" to "Hyper Text Transfer Protocol"
                                                )
    println("udp = ${protocol["udp"]}")

    // mutable Map
    var capitalMap : MutableMap<String, String> = mutableMapOf("korea" to "seoul")
    capitalMap.put("japan", "tokyo")
    capitalMap.put("usa", "washington")
    capitalMap.put("korea", "pusan")
    capitalMap.remove("japan")
    capitalMap.put("france", "paris")
    println("capitalMap = ${capitalMap}")

    print("Insert Nation : ")
    var nation = readLine()
    println("${nation} -> ${capitalMap[nation]}")

    val list = listOf(1, 2, 3, 4, 5, 6, 7)
    println("Odd Number = " + list.filter { it % 2 == 1 })

    var nums : Sequence<Int> = generateSequence(100) { it + 1 }
    println(nums.take(10).toList())
    println(nums.take(10).toList())
}