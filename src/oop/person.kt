package oop

import java.sql.Date

class person {
    //properties
    var name:String= ""
    var age:Int=0
    // METHODS
    fun speak(){
        println("hello, my name is$name, iam $age ")
    }
}
class vehicle(val model:String , val make :String, val yom:Int){
    fun identifycar(){
        println("this car is $make $model and was manufactured " + "$yom")
    }
}

// create an object from above class
fun main() {
    var person1 = person()
    val person2 = person()
    person1.name = "Musa"
    person1.age=24
    person1.speak()

    val vehicle1=vehicle("corrola","Toyota","2002")
    val vehicle2=vehicle("x","Toyota","2005")

    vehicle1.identifycar()
    vehicle2.identifycar()
}