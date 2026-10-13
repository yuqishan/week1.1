// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if(args.size!=1){
        println("Error")
        exitProcess(1)
    }
    val number1=args[0].toInt()
    var sum=0L
    for(n in 1.. number1 step 2 ) {
        sum += n
    }
        println(sum)
}
