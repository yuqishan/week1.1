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
    val X= ((number1+number2+number3)/3).roundToInt()
    val Grade = when {
        X in 0..39 -> "Fail"
        X in 40..69 -> "Pass"
        X in 70..100 -> "Distinction"
        else -> "?"
    }
    println("Average:$X")
    println("Grade:$Grade")
}
// Task 4.3: grade calculation using a when expression
