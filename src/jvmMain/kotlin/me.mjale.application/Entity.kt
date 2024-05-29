package me.mjale.application;

import java.util.UUID
import java.util.function.BiPredicate

enum class EntityType {
    EASY,MEDIUM,HARD,HELP;

    fun getFormattedName() = name.lowercase()
}

object  EntityFactory {
    fun create(type: EntityType) : Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type) {
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> "Hard"
            EntityType.HELP -> "Help"
        }
        return when (type) {
            EntityType.EASY -> Entity.Easy(id,name)
            EntityType.MEDIUM -> Entity.Medium(id,name)
            EntityType.HARD -> Entity.Hard(id,name,)
            EntityType.HELP -> Entity.Help
        }
    }
}

sealed class Entity() {
    object Help : Entity(){
        val name = "Help"
    }
    data class Easy(val id: String, val name: String): Entity()
    data class Medium(val id: String, val name: String): Entity()
    data class Hard(val id: String, val name: String): Entity()
}

fun Entity.Medium.printInfo() {
    println("Medium class: $id")
}

fun printFilteredStrings(list: List<String>, predicate: (String) -> Boolean) {
    list.forEach{
        if (predicate(it)) {
            println(it)
        }
    }
}



//Extension classes

/* object EntityFactory {
    //fun create() = Entity("IDdefault","nameDefault")
    fun createComplex(type: EntityType) :Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> "Hard"
        }
        return Entity(id,name)
    }
} */

fun getPrintPredicate():(String) -> Boolean {
    return {it.startsWith(prefix = "J")}
}

fun main() {
    val entity1 = Entity.Easy("id","name")
    val list = listOf("kotlin","java",null,null)
    Entity.Medium("id","name").printInfo()
    val map = list
        .filterNotNull()
        .associate { it to it.length }

        val language = list.filterNotNull().findLast { it.startsWith("foo") }.orEmpty()
        println(language)

    }



