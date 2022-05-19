package com.kbstar.kotlin

// A03AliasClass
import com.kbstar.kotlin.A02Car as Car

fun main() {
    val taxi = Car("alias taxi", 1)
    val bus = Car("alias bus", 2)
    val truck = com.kbstar.kotlin.A02Car("truck", 3)

    print("taxi.name = ${taxi.name}")

    /*
        C : ip 주소 1.2.3.4
        unsigned int serverIP = 12345

        IP serverIP = 1233
        IP clinetIP = 223343

        typedef unsigned int IP_t
     */
}