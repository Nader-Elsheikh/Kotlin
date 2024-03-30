package com.example.hellokotlin

import java.util.Scanner

fun main (){
    MyFirstFunction("Nader",21)


    val n1 = Scanner(System.`in`)
    println("Enter the first number")
    var x:Int = n1.nextInt()
    val n2 = Scanner(System.`in`)
    println("Enter the second number")
    var y:Int = n2.nextInt()
    var z =  AddNumbers(x,y)
    println("the sum of $x + $y is -> $z")

    // create a c1 object from the Car class
    var c1 = Class("BMW",2025,"Red")
    //Access the properties
    println(c1.brand)
    //Access the function
    c1.drive()  //ctrl + space

    var b1 = BusinessMan("Nader",21)
    b1.walk()


} // End main


// Function with paramiters
fun MyFirstFunction (name:String , age:Int){
    println("Hello my name is $name & iam $age years old")
    println("This is the program to add two numbers")
}

// Return value function : function that return value to the main function after the operation
fun AddNumbers (x:Int,y:Int):Int {
    val z = x+y
return z
}