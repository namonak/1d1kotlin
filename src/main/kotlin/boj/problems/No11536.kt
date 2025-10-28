package boj.problems

import java.io.BufferedReader

class No11536 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val names = (1..n).map { input.readLine() }
        val sortedNames = names.sorted()
        val isIncreasing = names == sortedNames
        val isDecreasing = names == sortedNames.reversed()
        return when {
            isIncreasing -> "INCREASING"
            isDecreasing -> "DECREASING"
            else -> "NEITHER"
        }
    }
}
