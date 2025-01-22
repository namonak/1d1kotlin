package boj.problems

import java.io.BufferedReader
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class No28454 {
    fun solve(input: BufferedReader): String {
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
        val currentDate = LocalDate.parse(input.readLine().trim(), formatter)
        val n = input.readLine().toInt()
        var validCount = 0
        repeat(n) {
            val expireDate = LocalDate.parse(input.readLine().trim(), formatter)
            if (!expireDate.isBefore(currentDate)) {
                validCount++
            }
        }

        return validCount.toString()
    }
}
