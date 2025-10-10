package boj.problems.step13

import java.io.BufferedReader

class No18870 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val number = input.readLine().split(" ").map { it.toInt() }

        val sortedNumber = number.sorted().distinct()
        val map = sortedNumber.mapIndexed { index, i -> i to index }.toMap()

        return number.joinToString(" ") { map[it].toString() }
    }
}
