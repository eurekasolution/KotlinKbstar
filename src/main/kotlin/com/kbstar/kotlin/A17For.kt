package com.kbstar.kotlin

/*
반복문 : for, while(), do~while()
 */

fun main() {
    var sum = 0

    for(x in 1..10)
        println("${x}")

    for(x in 1..10 step 2)
        println("${x}")

    println("down")
    for(x in 10 downTo 1 step 2)
        println("${x}")

    /*
        사용자로부터 구구단의 단(table)을 입력받아서
        해당하는 단을 출력하시오.
     */

    print("Insert Table : ");
    var table = readLine()!!.toInt()
    for(x in 1..9)
    {
        println("${table}  * ${x} = ${table * x}")
    }

    // println("A".repeat(5))

    /*
        line = 5       #space    #star
      *4   1      -->   line-1   2*line -1
     ***3   3     -->   5-2
    *****2   5    -->   5-3
   *******1   7   -->   5-4
  *********0   9  -->   5-0
     */

    print("Insert Line : ");
    var line = readLine()!!.toInt()

    for(n in 1..line)
    {
        // space
        for(space in 1..(line - n))
            print(" ")
        // star
        for(star in 1..(2*n -1))
            print("*")

        println("");
    }

    // 1 ~ 100
    sum = 0

    for(x in 1..100 step 1)
        sum = sum + x

    println("1+2+ ... + 100 = ${sum}")

}