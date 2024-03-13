fun main(){
 var grade:Int =80
 var chem: Int =79
 if (chem>grade){
     println("pass")
 }

//var number: Int =0
//    if (number>0){
//        println("positive")
//    }else if (number<0){
//        println("negative")
//    }else{
//        println("zero")
//    }

//var number  =16
//    if (number % 2==0 ){
//        println("even")
//    }else {
//        println("odd")
//    }

var geo: Int =65
var comp:Int =90
var bio :Int =78
var sum = geo+comp+bio
var avg = sum/3
//    println(sum)
    println(avg)
if (avg>100){
    println("invalid")
}else if (avg<0){
    println("error")
}else if(avg<39) {
    println("D")
}else if(avg<=59){
    println("C")
}else if(avg<=70){
    println("B")
}else if (avg>71){
    println("A")
}

}
