package com.kbstar.kotlin

import java.util.*


/*
    무한루프를 돈다.
    사용자한테 게임수를 입력받는다(1~5) : readLine()
    0 : 프로그램 종료
    3 : 3게임의 로또번호를 생성합니다.
        중복제거를 보장..
        오름차순 정렬..

 */

fun main() {
    var a = 2
    var b = 5

    println("a = %02d , b = %05d".format(a, b))

    var lotto = Array(6, {0})
    var game = 0
    var random = Random()

    println("size = " + lotto.size)
    while(true)
    {
        print("Insert Game Count (0 to Exit): ")
        game = readLine()!!.toInt()

        if(game == 0)
        {
            println("Good Bye~")
            break;
        }

        for(i in 1.. game)
        {
            println("${i} 번째 게임을 시작합니다.")

            for(j in 0..lotto.size -1)
            {


                while(true) {
                    var flag = false
                    lotto[j] = random.nextInt(1, 46)

                    for (k in 0..j - 1) {
                        if (lotto[k] == lotto[j]) {
                            print("XX ${lotto[k]}")
                            flag = true
                            break
                        }
                    }

                    if(flag == false)
                        break
                }
            }

            // sorting

            println(Arrays.toString(lotto))
        }
    }
}