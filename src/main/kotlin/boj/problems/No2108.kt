package boj.problems

import java.io.BufferedReader
import kotlin.math.roundToInt

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2108.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No2108 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val numbers = mutableListOf<Int>()
        val count = mutableMapOf<Int, Int>()

        for (i in 0 until n) {
            val number = input.readLine().toInt()
            numbers.add(number)
            count[number] = count.getOrDefault(number, 0) + 1
        }

        val sortedNumbers = numbers.sorted()
        val average = sortedNumbers.average().roundToInt()
        val median = sortedNumbers[n / 2]
        val mode = count.filter { it.value == count.maxByOrNull { it.value }!!.value }.toList().sortedBy { it.first }
        val range = sortedNumbers.last() - sortedNumbers.first()

        return """
            $average
            $median
            ${mode[if (mode.size == 1) 0 else 1].first}
            $range
            """.trimIndent()
    }
}
