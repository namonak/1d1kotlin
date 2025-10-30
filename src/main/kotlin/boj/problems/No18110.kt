package boj.problems

import java.io.BufferedReader
import kotlin.math.roundToInt

class No18110 {
    fun solve(input: BufferedReader): String {
        val count = input.readLine().toInt()
        val numbers = IntArray(count) { 0 }

        for (i in 0 until count) {
            numbers[i] = input.readLine().toInt()
        }

        return if (count == 0) {
            0
        } else {
            val removeCount = (count * 0.15).roundToInt()
            val removeNumbers = numbers.sorted().subList(removeCount, count - removeCount)
            removeNumbers.average().roundToInt()
        }.toString()
    }
}
