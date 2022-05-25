package com.kbstar.kotlin

// A49List.kt
/*
    Collection :
        STL Standard Template Library
                     Telmlete
                     Computer, Computor
        Data Structure 를 일반화 시켜놓은 데이터 셋
        List, Stack, Queue, Tree, Set, Map....
            성능이 최적화 되어있다.
            시간복잡도, 공간복잡도가 공표되어 있다.

            o o o o o o o o o o o  = n / 2 = O(n)
                                               O(n^2)
                            o
                         o        o
                      o   o     o   o
                     o o o o   o o o o        O(logN)

                     A - B - C - D
 */

fun main() {
    var nums : List<Int> = listOf(1, 2, 3, 4, 5)
    var names : List<String> = listOf("kim", "lee", "park", "choi")

    println("names = ${names.toString()}")
    for( name in names)
        print("${name} - ")

    println()

    println("nums = ${nums.toString()}")

    for(x in names.indices)
        println("names[$x] = ${names[x]}")

    println()

    for(index in 0..names.size -1)
        println("names[$index] = ${names[index]}")

    println()

    var index = 0
    while(index < names.size)
    {
        println("$index : ${names[index]}")

        var tmp = names.get(index)
        println("tmp = $tmp")

        index ++
    }

    var emptyList: List<String> = emptyList<String>()
    var emptyList2: List<String> = listOf()
    println("emptyList = ${emptyList.toString()}")
    println("emptyList2 = ${emptyList2.toString()}")

    emptyList.plus("one")
    emptyList.plus("two")
    println("emptyList = ${emptyList.toString()}")

    println(names)
    // get(index)
    var total = names.size
    println("${names[2]}")
    var pos = names.indexOf("park")
    println("post = ${pos}")

    pos = names.indexOf("hong")
    println("post = ${pos}")

    println("conatains lee = ${names.contains("lee") } " )
    println("conatains hong = ${names.contains("hong") } " )

    // List, ArrayList

    var langs : ArrayList<String> = arrayListOf<String>("HTML", "JS", "PYTHON", "KOTLIN")
    println("langs = ${langs}")
    println("langs = ${langs.toString()}")

}