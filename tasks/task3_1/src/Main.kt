import kotlin.system.exitProcess
fun main(args:Array<String>){
    if(args.size!=3){
        println("Error:three arguments required")
        exitProcess(1)
    }
        println(args[0])
        println(args[1])
        println(args[2])
}// Task 3.1: command line arguments


