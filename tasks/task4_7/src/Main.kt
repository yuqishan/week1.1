import kotlin.io.path.*
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Please provide one file path")
        exitProcess(1)
    }

    val filePath = Path(args[0])

    var lineNumber = 0
    var longestLength = 0
    var longestLineNumber = 0

    filePath.forEachLine {
        lineNumber += 1

        if (lineNumber == 1 || it.length > longestLength) {
            longestLength = it.length
            longestLineNumber = lineNumber
        }
    }

    if (lineNumber == 0) {
        println("The file is empty")
    } else {
        println("Line $longestLineNumber is the longest (length = $longestLength)")
    }
}