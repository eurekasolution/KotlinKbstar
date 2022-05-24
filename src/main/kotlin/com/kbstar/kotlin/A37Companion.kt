package com.kbstar.kotlin

// A37Companion.kt
// Companion 은 자바의 Static = 공유메모리

class Static
{
    var id: Int = 0
    var name: String = "no name"

    companion object {
        var lang: String = "Korean"
        fun work()
        {
            println("working....")
        }
    }
}

fun main() {
    // 원칙 : 객체를 생성한 사용,
    println(Static.lang)    // 인스턴스를 생성하지 않고 기본값을 사용
    //println(Static.name)
    Static.lang = "English"
    println(Static.lang)
    Static.work()


    var share1 = Static()
    var share2 = Static()

    println("share1.lang = ${Static.lang}")
    Static.lang = "Kotlin"
    println("share1.lang = ${Static.lang}")
}

/*
    class Car
    {
        int a;
        static int b;
    }

    Car taxi = new Car();
    Car bus = new Car();

    taxi.b = 1;
    bus.b = 2;
    System.out.println(taxi.b)
    System.out.println(Car.b)

 */