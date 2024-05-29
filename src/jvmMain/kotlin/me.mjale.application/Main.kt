package me.mjale.application

import sun.jvm.hotspot.oops.CellTypeState.value

//Type System
//Top Level Variable
val name: String = "Top Level Variable"
val nameNonType = "It's type variable String"
val nameNonTypeNull = null
val greeting: String? = "Hello"
var greetingName: String = "type declared as "

//Type inferences, we are able to omit the type declaration
var greetingTypeInference = "No greeding"
var greetingTypeInference2: String? = null

fun getStock(): String {
    return "getStock Stock return value"
}

fun getStockActive(stockActive:String):String {
    val stock = "Stock : $stockActive"
    //ArrayList
    val stockList = arrayOf("MAD","BCN")
    println(stockList.size)
    println(stockList[0])

    //forEach returns unit
    stockList.forEach { String
        println(it)
    }

    //Map
    val map = mapOf(1 to "LPA",2 to "BCN", 3 to "MAD")
    map.forEach{ key,value -> println("$key->$value") } //access individual element in the collection
    val mapMutable = mutableMapOf(1 to "LPA",2 to "BCN", 3 to "MAD")
    mapMutable.put(4,"SCP")
    //Differences between immutable and mutable

    //LENSES


    return "getStock Stock return value"
}

fun getStockActiveFun(stockActive: String) = "Stock : + $stockActive"

fun getStockList(): String {
    return "getStock Stock return value"
}

//Collections
//fun getStockListMultipleArguments(a :String,b : mapof()) {

//}



fun main() {


    //
    getStock()
    getStockList()
    getStockActive("STKNAME")

    println("this is a new application")
    val nameLocal: String= "Local Variable"
    println(name)
    println(nameNonTypeNull)
    //greeting : immutable variable
    println(greetingTypeInference)

    //if
    if(greeting != null) {
        //doNothing
        println("yes else")
    } else {
        println("else no")
    }

    when(greeting) {
        null -> println("when greeting true")
        else -> println(greeting)
    }

    val greetingToPrint = if(greeting != null) greeting else "greeting"
    println(greetingToPrint)
    println(if(greeting != null ) greeting else "greeting doesn't pass")
    println(when(greeting) { null -> "greeting is null" else -> "greeting is not null "+greeting})

    val mapPassFunction = mapOf(1 to "LPA",2 to "BCN", 3 to "MAD")
    val arrayPass = arrayOf("1,2")
    //getStockListMultipleArguments("Text", *mapPassFunction)






}