package com.example.hellokotlin

open class Person (var name : String, var age : Int ) {
init {
    println("the person name is $name")
    println("the person age is $age")
}
    fun talk(){
        println("the person $name is talking")
    }
    fun walk(){
        println("the person $name is walking")
    }
    fun eat(){
        println("the person $name is eating")
    }
} // End Person class


class Player(name: String,age:Int):Person(name,age){


} // End Player class

class Teacher (name: String,age:Int):Person(name,age){

} // End Teacher class

class BusinessMan (name: String,age:Int):Person(name,age){

} // End BusinessMan class