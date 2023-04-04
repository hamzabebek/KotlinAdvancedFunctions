package com.example.kotlinadvancedfunctions

fun main() {
    val myNumList = listOf<Int>(1,3,5,7,9,11,13,15)
    /*
    val smallNumberList = myNumList.filter { num -> num < 6 }
    for (num in smallNumberList){
        println(num)
    }*/
    /*val smallNumberList = myNumList.filter { it < 6 }
    for(num in smallNumberList) {
        println(num)
    }*/

    //map

   /* val squaredNumbers = myNumList.map { num -> num * num }
    for (num in squaredNumbers){
        println(num)
    }*/

    /*val squaredNumbers = myNumList.map { it * it }
    for (num in squaredNumbers){
        println(num)
    }*/

    val filterAndMapCombined = myNumList.filter { it < 6 }.map {it * it}

    for (num in filterAndMapCombined){
        println(num)
    }
    val musicians = listOf<Musicians>(
        Musicians("James",60,"Guitar"),
        Musicians("Lars",55,"Drum"),
        Musicians("Kirk",50,"Guitar")
    )
    val newList = musicians.filter { it.age < 60 }
    for (new in newList){
        println(new.instrument)
    }
}

data class Musicians(val name : String, val age : Int, val instrument : String)