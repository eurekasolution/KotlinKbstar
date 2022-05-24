package com.kbstar.kotlin

// A30Protected

open class Base { // 최상위 클래스에서는 proteced 사용 불가
    protected var age = 1
    protected fun protectedFunc() {
        age ++
    }

    fun access() {
        protectedFunc()     // 같은 클래스 내에서는 허용
    }

    // innert Class, nested Class

    protected class NestedClass() {

    }
}

class Derived : Base()
{
    fun test(): Int{
        protectedFunc()
        return 1
    }
}

fun main() {
    var base = Base()
    //println(base.age)
    //base.protectedFun()
    base.access()
}