// a string is characters with "" that store text
//string contains  a collection of characters  surrounded
//double quotes
var txt="hello world"
//string  concartination
var firstname="kirenge"
var lastname="musa"

fun main(){
    println(txt[4])
    println(txt.length)
    println(txt.uppercase())
    println(txt.lowercase())
    var fullname="my name is" + firstname+" " +lastname
    println(fullname)
    println("my name is $firstname $lastname")
}
