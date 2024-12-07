package boj.problems

import java.io.BufferedReader
import java.time.LocalDate

class No10420 {
    fun solve(input: BufferedReader): String {
        val startDate = LocalDate.of(2014, 4, 2)
        val daysToAdd = input.readLine().toInt()
        val anniversaryDate = startDate.plusDays(daysToAdd.toLong() - 1)
        return anniversaryDate.toString()
    }
}
