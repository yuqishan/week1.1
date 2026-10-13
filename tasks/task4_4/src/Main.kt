// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    if(args.size!=3){
        println("Error")
        exitProcess(1)
    }
    var initial=args[0].toDouble()
    val max=args[1].toDouble()
    val n3 =args[2].toDouble()
    while (initial<=max){
        val fahrenheit = initial * 9.0 / 5.0 + 32
        println("%8.1f %8.1f".format(initial, fahrenheit))
        initial += n3
    }

}
