package com.kbstar.kotlin

// A29Encapsulation.kt


private class PrivateClass
{
    private var i = 1

    private fun privateFunction()
    {
        i = i + 1
    }

    fun access()
    {
       privateFunction()
    }
}

class OtherClass
{
    // var opc = PrivateClass() // 허용 안됨. private class 이므로

    fun access() {
        var pc = PrivateClass()
        // 생성 가능, 함수에서는 private 클래스의 객체를 생성할 수 있다.
    }

}

fun topFunction()
{
    var tpc = PrivateClass();
}

fun main() {
    var pc = PrivateClass()     // main에서는 허용, 함수내에서는 허용
                                // 객체를 생성은 가능하지만,
                                // getter, setter가 없으면 허용 안됨됨
    //var x = p.i
    pc.access()
    //pc.privateFunction() // not visible

}
