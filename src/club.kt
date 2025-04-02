fun main () {
    println("welcome to the club entry system")
    print("enter your age:")
    val age = readln().toIntOrNull() ?: 0
    if (age == null || age <= 18) {
        println("you have been denied access since you are under 18")
        return
    }
    print("are you a member(yes/no)")
    val isamember = readln().lowercase()

   var hasVipPass=""

    if (isamember == "yes") {
        println("are you a vip member? (yes/no):")
        val hasVipPass = readln().lowercase()
    }

    if (hasVipPass == "yes") {
        println("welcome to  vip get access to free drinks")
        return
    }
    if ( isamember == "yes"){
    print("enter you membership number")
    val membershipNumber = readln()
    println("sucessfully granted! Member Number : $membershipNumber")

    }else{
        println("sucessfully acessed! get free drink discount")
    }
}

