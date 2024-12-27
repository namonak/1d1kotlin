package boj.problems

import java.io.BufferedReader
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.Locale

class No1340 {
    fun solve(input: BufferedReader): String {
        val inputLine = input.readLine()
        val formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy HH:mm", Locale.ENGLISH)
        val dateTime = LocalDateTime.parse(inputLine, formatter)
        val year = dateTime.year
        val daysInYear = if (isLeapYear(year)) 366 else 365
        val totalMinutesInYear = daysInYear * 24 * 60

        val startOfYear = LocalDateTime.of(year, 1, 1, 0, 0)
        val elapsedMinutes = ChronoUnit.MINUTES.between(startOfYear, dateTime).toDouble()
        val progressPercentage = (elapsedMinutes / totalMinutesInYear) * 100

        return String.format("%.9f", progressPercentage)
    }

    private fun isLeapYear(year: Int): Boolean {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
    }
}
