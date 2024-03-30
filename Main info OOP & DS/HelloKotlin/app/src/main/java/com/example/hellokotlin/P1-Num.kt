package com.example.hellokotlin

import java.util.Scanner

fun main(){
val i=0
   while (i<=0){
       val n1 = Scanner(System.`in`)
       var num1:Int = n1.nextInt()

       val nums = arrayOf(2,4,6,8,10,12,14,16,18,20)
       if (num1 in nums){
           println("It Exist")
       }else{
           println("It does't Exist")
       }
   }

}