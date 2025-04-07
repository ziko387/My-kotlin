 // functions are reusable blocks of code that performs specific tasks
 // simple function /named function
 fun greet(){
     println("hello from the named function")
 }
 //function with parameters
 fun greet_with_params(name: String){
     println("hello from the param function :$name")
 }
 //function with a return value
 fun add(a:Int, b:Int): Int{
     return a+b
 }
 // functions with default parameters
 fun subtract(a: Int,b: Int):Int{
     return a -b
 }
 fun main(){
     greet() //invoking a function
     greet_with_params("ian") // invoking a function with params
     greet_with_params("musa")
     val sum=add(5,2)
     val diff=subtract(7,3)
     println(sum)
     println(diff)
 }