package boj.problems

import java.io.BufferedReader
import kotlin.math.roundToInt

class No2108 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val numbers = mutableListOf<Int>()
        val count = mutableMapOf<Int, Int>()

        repeat(n) {
            val number = input.readLine().toInt()
            numbers.add(number)
            count[number] = count.getOrDefault(number, 0) + 1
        }

        val sortedNumbers = numbers.sorted()
        val average = sortedNumbers.average().roundToInt()
        val median = sortedNumbers[n / 2]
        val maxFreq = count.values.maxOrNull() ?: return ""
        val mode = count
            .filterValues { it == maxFreq }
            .toList()
            .sortedBy { it.first }
        val range = sortedNumbers.last() - sortedNumbers.first()

        return """
            $average
            $median
            ${mode[if (mode.size == 1) 0 else 1].first}
            $range
            """.trimIndent()
    }
}
