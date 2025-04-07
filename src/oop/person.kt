package oop

import java.sql.Date
import java.time.Year

class Person {
    //properties
    var name:String= ""
    var age:Int=0
    // METHODS
    fun speak(){
        println("hello, my name is$name, iam $age years old")
    }
}
class Vehicle(val model:String , val make :String, val yom: Int){
    fun identifycar(){
        println("this car is $make $model and was manufactured in $yom")
    }
}

// create an object from above class
fun main (){
    val person1 = Person()
    val person2 = Person()
    person1.name = "Musa"
    person1.age=24
    person1.speak()

    val vehicle1=Vehicle("corrolla","Toyota",2005)
    val vehicle2=Vehicle("x","Toyota",2005)

    vehicle1.identifycar()
    vehicle2.identifycar()
}