package boj.problems

import java.io.BufferedReader

class No2592 {
    fun solve(input: BufferedReader): String {
        val numbers = IntArray(10)
        var sum = 0
        repeat(10) {
            val number = input.readLine().toInt()
            numbers[it] = number
            sum += number
        }
        val average = sum / 10
        val mode = numbers.groupBy { it }.maxByOrNull { it.value.size }!!.key

        return "$average\n$mode"
    }
}
