package com.example.hellokotlin

import java.util.Scanner

// main function
fun main(){

    //string
    println("First code by NaElsheikh")

    val name = "Nader"
    println("Hello $name \"s")

    //if condition
    val i = 10
    if (i<20){
        println ("less than 20")

    }

    //when condition
    val x = 10
  val z = when(x){
        0 -> "zero"
        in 1..4 -> "four or less"
        else -> "some number out of range"
    }
    println(z)

    //while loop
    var f=1
    while (f<10){
        println(f)
        f++
    }

    //do while loop
    var d= 7
    do {
        println("Hello")
        d++
    }while (d<10)

    // break & contenue key words

    //Array
    val cars = arrayOf("bmw","honda","mercedes","reno","volvo","Mazda")
        println(cars.size)
    var h = readLine()
    if (h in cars){
        println("$h is exist in cars array")
    }else{
        println("$h isn't exist in the cars array")
    }
    // for loop
    for (s in cars){
        println("all cars in the array is $s")
    }


    // Ranges -> range expressed by two dots ..
    for (chars in 'a'..'e'){
        println(chars)
    }

    for (numbers in 1..20 ){
        println(numbers)
    }

    val nums = arrayOf(2,4,6,8,10,12,14,16,18,20)
    if (10 in nums){
        println("It Exist")
    }else{
        println("It does't Exist")
    }





}
