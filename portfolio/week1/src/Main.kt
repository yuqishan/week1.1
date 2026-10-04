// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args:Array<String>){
    if(args.size!=3){
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    val number1=args[0].toDouble()
    val number2=args[1].toDouble()
    val number3=args[2].toDouble()
    val s= (args[0].toDouble()+ args[1].toDouble() + args[2].toDouble())/2
    val Area=sqrt(s*(s-args[0].toDouble())*(s-args[1].toDouble())*(s-args[2].toDouble()))
    println("Area=%.5f".format(Area))

}