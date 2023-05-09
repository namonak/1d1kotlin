package boj.problems.step13

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2587.solve(input))

    input.close()
    output.flush()
    output.close()
}

private const val GIVEN_NUMBERS = 5
private const val MIDDLE_INDEX = 2

object No2587 {
    fun solve(input: BufferedReader): String {
        val numbers = mutableListOf<Int>()
        var sum = 0

        for (i in 0 until GIVEN_NUMBERS) {
            val number = input.readLine().toInt()
            numbers.add(number)
            sum += number
        }
        numbers.sort()

        return "${sum / GIVEN_NUMBERS}\n${numbers[MIDDLE_INDEX]}"
    }
}
