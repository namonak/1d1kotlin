package boj.problems

import java.io.BufferedReader

class No28074 {
    fun solve(input: BufferedReader): String {
        val str = input.readLine()
        val charCounts = str.groupBy { it }.mapValues { it.value.size }

        return if ((charCounts['M'] ?: 0) >= 1 &&
            (charCounts['O'] ?: 0) >= 1 &&
            (charCounts['B'] ?: 0) >= 1 &&
            (charCounts['I'] ?: 0) >= 1 &&
            (charCounts['S'] ?: 0) >= 1
        ) {
            "YES"
        } else {
            "NO"
        }
    }
}
