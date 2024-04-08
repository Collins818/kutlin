import java.util.Scanner
fun main(){
    val reader=Scanner(System.`in`)
    println("enter your temp:")
    var dd:Int=reader.nextInt()
    var new: Int = (dd*9/5)+32
    println("temp $new")
}