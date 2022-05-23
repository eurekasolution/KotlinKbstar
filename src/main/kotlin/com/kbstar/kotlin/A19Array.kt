package com.kbstar.kotlin

import java.util.*

/*
    int[] lotto = new int[6];
    배열의 치명적인 단점은 동일한 데이터타입의 연속된 메모리를 할당
 */
fun main() {
    var array1 = arrayOf(1,2,3,4,5)
    var array2 = Array(5, {7})
    var anyArray = arrayOf(1, "hello", 12.3, true, 3.14f)
    var intArray = arrayOf<Int>(11,22,33,44,55)
    var stringArray = arrayOf<String>("하나","둘","셋","넷","다섯", "여섯", "일곱")

    println("array1 = ${array1} , ${array1[2]}")
    for(i in 0 until stringArray.size)
    {
        //println("$i  : ${array2[i]}")
        //println("$i  : ${anyArray[i]}")
        //println("$i  : ${intArray[i]}")
        println("$i  : ${stringArray[i]}")
    }


}