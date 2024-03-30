package com.example.hellokotlin

import java.util.Scanner

fun main (){

    val i=0
    var flag = false
    while (i<=0) {
        print("Enter a number to check if it prime or not: ")

        val n1 = Scanner(System.`in`)
        var x: Int = n1.nextInt()

        for (i in 2..x/2){
            if (x%i==0){
                flag= true
                break
            }
        }

        if (!flag){
            println("$x is prime number")
        }else{
            println("$x is not prime number")
        }

    }


}