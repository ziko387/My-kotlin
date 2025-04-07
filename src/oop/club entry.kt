package oop

import java.time.LocalTime
import java.time.format.DateTimeFormatter

// define  some constant values
enum class MembershipTypes{
    REGULAR,
    VIP,
    GUEST;
 //companion object : this reference variable/fun that belong to the class and not instances of the class

 companion object {
     fun fromInput(input:String):MembershipTypes?{
         return when(input.uppercase()){
             "R" -> REGULAR
             "V" -> VIP
             "G" -> GUEST
             else -> null
         }
     }
 }
}
data class Member(
    val id : Int,
    val name:String,
    val Membership:MembershipTypes,
    val entryTime: LocalTime=LocalTime.now()
)
// club rules interface
interface ClubRules{
    val minimumAge:Int
    val vipBenefits:String
    fun canEnter(member:Member):Boolean
}
//main class
class Night(override val )