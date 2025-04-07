// arrays are used to store multiple values in a single variable
// create an array using arrayof(),listof()
val car_1= arrayOf("volvo","BMW","Mazda","toyota","corolla","toyota x")
//accessing element inside of an array
// we access an element by refering  to the index number inside{}'s
// index positioning stats at o

fun main(){
    println(cars[1]) // accesses element in arrays
    // changing an element inside an array
    // simply accessing an element and reassigning its value
    car_1[0] ="fill toyota"
    car_1[2] = " Toyota z"
    println(car_1)
    println(car_1.size)


    if("jeep" in car_1){
        println("it exists")
    }
    else{
        println("does not exist")
    }
    for (x in car_1){
        println(x)
    }
}
