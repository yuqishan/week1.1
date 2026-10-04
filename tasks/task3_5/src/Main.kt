// Task 3.5: simple file I/O

import java.nio.file.Path
import kotlin.io.path.appendText
import kotlin.io.path.writeText

fun main() {
    val path = Path.of("test.txt")

    path.writeText("Hello from Kotlin!\n")
    path.appendText("This is the second message.\n")
}