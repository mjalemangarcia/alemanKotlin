package me.mjale.application

interface PersonProvider {
    fun printPerson(person : Persona) {
        println("basicInteface implementatoin")
        println(person.firstName)
    }
}

class BasicPersonProvider : PersonProvider {
    override fun printPerson(person: Persona) {
        println("override fun printPerson")
        println(person.firstName + person.lastName)
    }
}

fun main() {
    val providerI : PersonProvider
    //providerI.printPerson(person = Persona("x","y"))
    // Provider has to be initializer
    val provider : BasicPersonProvider
    //provider.printPerson(person = Persona("x","y"))
}