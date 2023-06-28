package boj.problems

import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {
    val output = System.out.bufferedWriter()

    output.write(No10699.solve())

    output.flush()
    output.close()
}

object No10699 {
    fun solve(): String {
        val currentDate = LocalDate.now()
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")

        return currentDate.format(formatter)
    }
}
