package boj.problems

import java.io.BufferedReader

class No29847 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val frequency = mutableMapOf<Char, Int>()

        repeat(n) {
            input.readLine().forEach { ch ->
                if (ch != ' ') {
                    frequency[ch] = (frequency[ch] ?: 0) + 1
                }
            }
        }

        val sorted = frequency.toSortedMap()

        return buildString {
            for ((ch, count) in sorted) {
                append(ch).append(' ').append(count).append('\n')
            }
        }.trimEnd()
    }
}
