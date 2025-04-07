package oop

// these classes are normally used to hold data objects

data class User(val name:String,val id:Int)

// enum classes : hold a collection of constant values
enum class Direction{
    NORTH, SOUTH , EAST, WEST , NORTHWEST
}

fun main(){
    val user1=User("Musa",2003)
    println(user1)
}