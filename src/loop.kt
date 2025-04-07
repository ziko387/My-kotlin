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
         println(i)
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
   //nested loop : a loop inside a loop
   // for every iteration of the outer loop ,the inner loop must complete  its set of iterations
    for (i in 1..3){ //outer loop
        println("$i : outer loop")
        for (j in 1..3){ // inner loop
            println("$j: inner loop")
        }

    }
    // loop CONTROL STATEMENT: break , continue
    //labels(outer and inner)
    // break : it terminates the loop when a condition is meet
    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println(i)
    }
    for (i in 1..10){
        if (i == 5){
            continue
        }
        println(i)
    }
   // label statement outer and inner (@)
    outer@ for (i in 1..3){
        inner@ for (j in 1..3){
            if (i ==2 && j ==2){
                break@outer
            }
            println("i=$i , j=$j")
        }
    }
}
 fun converttoUpper(i: String){
     println(i.uppercase())
 }

