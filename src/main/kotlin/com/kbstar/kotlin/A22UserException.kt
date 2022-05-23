package com.kbstar.kotlin

// A22UserException

// 사용자 예외 클래스 만들기
class TestException(messages: String)  : java.lang.Exception(messages)

// mobile 입력받아서
// 010-1111-2222형식에 맞는지 확인

fun main() {
    var name = "Kdhong111"
    var mobile = "010-1111-1111"
    var koreanName = "홍a길동"

    try {
        validateName(name)
    }catch(e:java.lang.Exception)
    {
        println("예외발생 : ${e.message}")
    }

    try {
        validateMobile(mobile)
    }catch(e:java.lang.Exception)
    {
        println("예외발생 : ${e.message}")
    }

    try {
        validateKoreanName(koreanName)
    }catch(e:java.lang.Exception)
    {
        println("예외발생 : ${e.message}")
    }
}

fun validateKoreanName(name: String)
{
    if(name.matches(Regex("^[가-힣]{2,4}$")))
    {
        println("정상 한글")
    }else
    {
        throw TestException("한글이 아닙니다.!!")
    }
}

fun validateName(name: String)
{
    if(name.matches(Regex("[a-zA-Z]{1,10}")))
    {
        println("정상")
    }else
    {
        throw TestException("Name has Number!!")
    }
}

fun validateMobile(mobile: String)
{
    if(mobile.matches(Regex("^01[01]-[0-9]{4}-\\d{4}")))
    {
        println("정상폰번호")
    }else
    {
        throw TestException("Invalid Mobile Number!!")
    }
}