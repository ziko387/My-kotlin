package oop

import kotlin.math.abs

// interface are contracts between classes
//uses keyword interface to create one
// an interface will define functions which must be
// implemented on any class that extends the interface

interface Measurments{
    fun area():Double
    fun perimeter():Double

}
class Circle(val radius:Double):Measurments{
    override fun area():Double {
        return Math.PI * radius * radius

    }

    override fun perimeter():Double {
        return 2 * Math.PI * radius
    }
}
class Square(val length:Double):Measurments{
    override fun area(): Double {
        return length * length
    }
    override fun perimeter(): Double {
        return length *4
    }
}
class Triangle (val base:Double,val height:Double,val side:Double):Measurments{
    override fun area(): Double{
        return base* height
    }

    override fun perimeter(): Double {
        return side*3
    }
}

fun main (){
    val triangle1=Triangle(10.3,4.5, 6.0)
     val circle1=Circle(10.4)
    val square1=Square(10.3)
    println(circle1.area())
    println(circle1.perimeter())
    println(square1.area())
    println(square1.perimeter())
    println(triangle1.area())
    println(triangle1.perimeter())
}


