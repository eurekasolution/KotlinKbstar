package com.kbstar.kotlin

// A28ThisSuper.kt
// Person : name, age

open class PersonOne
{
    constructor(name: String){
        println("1. Person name = ${name}")
    }
    constructor(name: String, age : Int){
        println("2. Person name = ${name}, age = ${age}")
    }
}

class Banker: PersonOne{

    constructor(name: String) : this(name, 100) {
        println("3. Banker name = ${name}")
    }

    constructor(name: String, age:Int) : super(name, age) {
        println("4. Banker name = ${name}, age = $age")
    }
}

class PersonTwo(name: String, out:Unit =println("0. [Main Constructor]"))
{
    var nameCheck  = println("1. [Property] PersonTwo name = ${name}")

    init {
        println("2. [init] PersonTwo init()")

    }

    constructor(name:String, age:Int, out:Unit = println("3. [Secondary Constructor]")):this(name)
    {
        println("4. name = ${name}, age = ${age}")
    }
}

fun main() {
    var kim = Banker("kim")

    println("")
    var lee = PersonTwo("lee", 11)

}


/*
    생성자(Constructor) : 초기화 메소드
        1. 이름은 클래스와 이름이 같은 메소드
        2. 초기화 메소드도 메소드 => 시그너처만 다르면 계속만들수 있다.
        3.      리턴타입이 없다.
        4. 없으면 시스템이 알아서 만들어주지만,
            하나라도 있으면 프로그래머의 의지를 반영한다.

    class Car()
    {
        name,
        age

        public Car() {
            this("noname", 0)
        }

        public Car(name) {
            this.name = name
        }

        public Car(name, age) {
            this.name = name
            this.age = age
        }
    }

    class SportsCar extends Car
    {
        // turbo

        public SportsCar() { //}
        public SportsCar("bmw", 1) { super("bmw", 1) }
        public SportsCar("bmw", 2, true) {}


    }

    // main
    Car taxi = new Car()
    Car bus = new Car("bus");
    SportsCar bmw = new SportsCar("bmw", 1)


    자바의 접근 권한
    public
    protected
    private
    _______ : package


    Kotlin : public, private, protected, internal
    internal : 같은 정의에 모듈 내부에서 접근 가능

    private : Information Hiding, Data Encapsulation
 */