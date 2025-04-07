package oop
// ability of one class (sub_class) to inherit methods
// properties from another class(parent_class)

// parent class// use the open keyword to make class inheritable
open class Animal(val name:String ){
  open fun makeSound(){
        println("some generic animal sound")
    }
    fun printName(){
        println("the animal name is $name")
    }

}
class Dog(name: String) : Animal(name){
    override fun makeSound() {
        println("barks")

    }

}
// this dog blueprint can have its own properties and methods
// and can also override existing methods
fun main(){
    val dog=Dog("rexxi")
    dog.makeSound()
    dog.printName()

}