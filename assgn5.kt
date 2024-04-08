fun main(){
    val n1 = 75
    val n2 = 68
    var lcm: Int

    lcm = if (n1> n2) n1 else n2

    while (true){
        if (lcm % n1 == 0 && lcm % n2 == 0){
            println("LCM of $n1 and $n2 is $lcm")
            break
        }
        ++lcm
    }





}


