import kotlin.system.exitProcess
import kotlin.math.roundToInt
fun main(args:Array<String>){
    if(args.size!=3){
    println("Error")
    exitProcess(1)
    }
    val number1 = args[0].toDouble()
    val number2 = args[1].toDouble()
    val number3 = args[2].toDouble()
    val X= (number1.toDouble()+number2.toDouble()+number3.toDouble())/3
    when (X) {
        in 0..39 -> "Fail"
        in 40..69 -> "Pass"
        in 70..100 -> "Distinction"
    }
    println("Average:"$X)
    println("grade:"$X)
}
// Task 4.3: grade calculation using a when expression
