package me.mjale.application.`interface`

import me.mjale.application.Persona

interface PersonInfoProvider {

    val provideInfo : String
    fun printInfo(person :Persona) {
        println(provideInfo)
        println(person.firstName)
    }
}


