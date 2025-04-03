 // a loop allows repeat task a number of set times or over a collection of data
 //in kotlin for loops (used when we have no of iterations)
 // while in loop(continues as long as the condition is true)
 // and foreach loop(used to loop over collection e.g. arrays)
fun main(){
  //for loop
  //iterate over a range
    for (i in 1..5){
        println(i)
    }
     //adding a step
     for (i in 1..10 step 2){
         println(i)
     }
     //iterate down
     for (i in 5 downTo 1){
         println(i)
     }
     //iterate over a collection
     val fruits= listOf("mangoes","bananas","apples")
     for (i in  fruits){
         converttoUpper(i)
         println()
     }
     // print with index positioning
     for ((index,fruits) in fruits.withIndex()){
         println("$index :: $fruits")
     }
     //while a loop
     var i=1
     // basic while loop
     while (i <= 5){
         println(i)
         i++
     }
     // do while loop :: do executes without conditions then utilizes
     // the while block to look at the conditions
     var j=10
     do {
         println(j)
         j++

     }while (j <= 5)
}
 fun converttoUpper(i:string ){
     println(i.uppercase())
 }