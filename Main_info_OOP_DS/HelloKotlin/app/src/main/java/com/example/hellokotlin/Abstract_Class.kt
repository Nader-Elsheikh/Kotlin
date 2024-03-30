package com.example.hellokotlin

abstract class Abstract_Class {

    // Abstract Class use abstract key word
    //Data abstraction is the process of hiding certain details and showing
    // only essential information to the user.
    // Abstraction can be achieved with either abstract classes or interfaces
    // can't create an object/instance from abstract class but abstract class can be inherited

    var age:Int = 20

    fun display_age (){
        println("My age is $age")
    }

    // abstract function is a function without body
    // abstract functions is an important function that will be forced to appear in inherited classed

    abstract fun gg ()

}

// Interfaces
    // interface class is like abstract class but not using abstract key word
    // have the same future & maintinance for the code

// Nested Class
class outer(){
    var age = 25
    class nested {
        var length= 30

        // to access nested class after creating a var from the outer class there is a proprty to access it
        // var x = outer.nested ()

    }
}