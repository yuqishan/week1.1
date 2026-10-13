import kotlin.io.path.*

fun main(){
    val filePath=Path("text.txt")
    filePath.forEachLine{
        println(it.length)
    }

}

if (it.length > longestLength) {
    longestLength=it.length
    longestLineNumber=lineNumber
}