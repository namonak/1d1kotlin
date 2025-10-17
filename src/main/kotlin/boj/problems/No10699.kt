package boj.problems

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class No10699 {
    fun solve(): String {
        val currentDate = LocalDate.now()
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")

        return currentDate.format(formatter)
    }
}
