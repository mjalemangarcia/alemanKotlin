package me.mjale.application;

class Persona(val firstName: String , val lastName: String) {
        init {
            println("init")
        }
        constructor(): this("Name","Parker") {
            println("secondary constructor")
        }
        init {
            println("init 2")
        }

        var nickName: String? = null
            set(value) {
                field = value
                println("the new nickname is $value")

            }
    }

