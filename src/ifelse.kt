//kotlin has the following conditionals
// 1. use of if to specify that a block of code is to be executed if a condition is true
// 2. use of else to specify if the  above  condition is false
// 3. else if to add new condition to our test
// 4. when to specify an alternative to be executed
var a=45
var b=36
fun main (){
    if(a>b){
        println("$a is greater than $b")
    }
    else if (a<b){
        println("$a is less than $b")

    }
    else if (a==b){
        println("$a is equals to $b")
    }
    else{
        println("$a is not greater than $b")
    }
}