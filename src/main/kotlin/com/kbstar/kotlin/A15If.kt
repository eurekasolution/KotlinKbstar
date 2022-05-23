package com.kbstar.kotlin

fun main() {

    // console 사용자 입력 ,
    print("Insert Number : ")
    val num = readLine()!!.toInt()

    println("num = ${num}")
    var grade : Char = 'F'

    if(num>=90)
        grade = 'A'
    else if(num>=80)
        grade = 'B'
    else
        grade = 'F'

    println("your grade = ${grade}")

    print("Insert Number2 : ")
    val num2 = readLine()!!.toDouble()

    grade = 'F'

    if(num2>=90.0)
        grade = 'A'
    else if (num2 in 80.0..89.9)
        grade = 'B'
    else if(num2 in 70.0..79.9)
        grade = 'C'
    else
        grade = 'F'

    println("num2 = ${num2}, grade = ${grade}")

    print("Insert Score (Double) : ")
    val score = readLine()!!.toDouble()
    // grade = 'F'
    when(score)
    {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'
        !in 70.0..100.0 -> grade = 'F'
    }


}