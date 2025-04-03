//scoping simply references where we can access variables and functions
// global scope : this is simply a variable defined outside a function .it is mostly at the top part of the script
//local scope: variables defined within a function only accessible in the function
// block level scope : inner here belongs to the if statment and not the function(mostly in calibraces)


var full_name="musa"
fun convertlower(){
    val outer= "this is a variable inside the if statement"
    if (true){
        val inner ="this is the variable in the if statement"
        println(inner)
        println(outer)
    }
    full_name.lowercase()
    println(outer)

}
fun main(){
    println(full_name)
    convertlower()
}
