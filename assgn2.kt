import java.time.LocalDateTime
import java .time.Month
import java .time .DayOfWeek
import java.time.MonthDay
import java.time.LocalDate
import java.time.LocalTime
import java.util.Date
import kotlin.time.measureTime


fun main(){
//    var a : Int =45
//    var b : Int =89
//    var j : Int =67
//    if (a>b && a>b){
//        println("$a is max")
//    }else if(b>a && b>a){
//        println("$b is max")
//    }else
//        println("$j is max")

//if (a>b){
//    println("$a is max")
//}else if (a>j){
//    println("$a is max")
//}else if(b>a){
//    println("$b is max")
//}else if (b>j){
//    println("$b is max")
//
//}else
//    println("$j is max")
//
//}

    var time = LocalDateTime.now()
    println(time)
var yy = LocalDate.now()
    println(yy)
    var gg =LocalTime.now()
    println(gg)
var ji =yy.dayOfWeek
    println(ji)
var fi =yy.month
    println(fi)
var ti =yy.year
    println(ti)
var bi = yy.dayOfMonth
    println(bi)



}




