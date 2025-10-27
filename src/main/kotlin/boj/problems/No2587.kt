package boj.problems

import java.io.BufferedReader

private const val GIVEN_NUMBERS = 5
private const val MIDDLE_INDEX = 2

class No2587 {
    fun solve(input: BufferedReader): String {
        val numbers = mutableListOf<Int>()
        var sum = 0

        repeat(GIVEN_NUMBERS) {
            val number = input.readLine().toInt()
            numbers.add(number)
            sum += number
        }
        numbers.sort()

        return "${sum / GIVEN_NUMBERS}\n${numbers[MIDDLE_INDEX]}"
    }
}
