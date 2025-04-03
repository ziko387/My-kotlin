fun main(){
    print("enter your age")
    val age= readln().toIntOrNull() ?: 0
    if ( age == null || age < 18) {
        println("you are under 18")
        return

    }else if (age == null || age >= 18){
        println("entry granted")
    }
    print("are you a member (yes/no)")
    val member= readln().lowercase()
    if (member == "yes" )
        println("do you have an id (yes/no)")
    else if (member=="no"){
        println("invalid input")
        return
    }
    val id= readln().lowercase()
    print("enter your id number")
    if (id=="yes"){
        print("enter your idNumber")

    }
    else if (id=="no"){
        print("enter your memberNumber")

    }
    val memberNumber= readln().lowercase()
    println("sucessfully entered the club : $memberNumber")
    val idNumber= readln().lowercase()
    println("successfully entered the club:$idNumber")





}