package com.example.hellokotlin

fun main (){

    // immutable & mutable collection
    // immutable can't be change after creating it
    // mutable collection can be change or edit after creating it

    /* List: ordered collection in which we can access
              elements by using indicates that define
              a position for each element */

// Immutable list
    var L = listOf<Int>(2,3,4,5,6)
    for (i in L){
        print(i)
    }

// Mutable lists : supports both read and write functionalities
        var MList = mutableListOf("Nader","Shaimaa","Mohamed")

    // Modifying the elements
     MList[1]="Sis"

    // Adding Elements
    MList.add("Amr")

    for (i in MList){
        print(i)
    }


    // Set: It is a collection of unordered unique elements
    // It is a collection of unique elements (No duplicate elements).

    // Generally, the order of set elements does not have a significant effect.
    // We can not perform add or remove operations because it is an immutable Set.

// Immutable sets
    var S = setOf(20,3,5,4,5,3,20,"Hello")
    for (i in S){
        print(i)
    }


// Mutable set
    var s = mutableSetOf<Int>(2,4,6,8,10,8,6,4,2)
    // Adding element to a set
    s.add(33)
    // Remove element
    s.remove(4)
    for (i in s){
        print(i)
    }


    // A Map is an object that maps keys to values.
    // Map keys are unique and hold only one value for each key,
    // it is a set of key-value pairs. Each key refer to exactly one value.

    // The values can be duplicates but keys should be unique.
    // Maps are used to store logical connections between two objects,
    // for example, a student ID and their name.

    // As it is immutable its size is fixed and its methods support read-only access

// Immutable maps
    var M = mapOf(1 to "Nader", 2 to "shaimaa", 3 to "mohamed")
    for (i in M.keys){
        print(M[i])
    }

// Mutable maps
    var m = mutableMapOf<Int,String>(1 to "dad", 2 to "mom", 3 to "me")
    //add element to map
    m.put(4,"sis")
    // remove element from a map
    m.remove(1)

    for (i in m.values){
        print(i)
    }


}