package com.kbstar.kotlin

// A34GetterSetter.kt

class MyUser(_id : Int, _name:String, _age:Int)
{
    val id: Int = _id           // Read Only
    var name: String = _name
    var age: Int = _age
}

// 완전히 똑같은 표현
class MyUser2(val id:Int, var name:String, var age:Int)


class MyUser3(_id : Int, _name:String, _age:Int)
{
    val id: Int = _id           // Read Only
        get() = field

    var name: String = _name
        get() = field
        set(value) {
            field = value.uppercase()
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = age
        }

    fun changeToUpper()
    {
        name = name.uppercase();
    }
}

fun main() {
    var user = MyUser(1, "hong", 12)
    var kim = MyUser2(2, "kim", 23)

    user.age = 11
    var name = user.name

    println("name = $name , ${user.name}, ${user.age}")

    var user3 = MyUser3(111, "kim", 11)
    user3.age = 33

    var user4 = MyUser3(222, "abcd", 12)
    user4.changeToUpper()
    println("user4 name = ${user4.name}")

    //user3.name = "hongkildong"
    println("user3.name = ${user3.name}, age = ${user3.age}")
}

/*
    class BC
    {
        private a;
        public b;

        c() { a }

        public get/set(a)

        1. 변수 : private
        2. 메소드 : public
                private : printError()

    }
  ---------------------------------
   public .
        main()
        {
            BC bc = new BC();

            bc.printError()

        }


    class Car
    {
        private int speed;

        public int getSpeed(){
            return this.speed;
        }
        public void setSpeed(int speed)
        {
            if(speed<0)
                speed = 0;

            this.speed = speed;
        }
    }


    Car taxi = new Car()
    taxi.setSpeed(-10)
    taxi.setSpeed(77);


 */