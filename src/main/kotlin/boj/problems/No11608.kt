package boj.problems

import java.io.BufferedReader

class No11608 {
    fun solve(input: BufferedReader): String {
        val text = input.readLine()
        if (text.isEmpty()) return "0"

        val frequency = IntArray(ALPHABET_COUNT)
        for (ch in text) {
            frequency[ch - 'a']++
        }

        val usedFrequencies = frequency.filter { it > 0 }

        if (usedFrequencies.size <= MAX_ALLOWED_COMPLEXITY) {
            return "0"
        }

        val sorted = usedFrequencies.sortedDescending()
        val sumTwoLargest = sorted[0] + sorted[1]
        val deletions = text.length - sumTwoLargest

        return deletions.toString()
    }

    companion object {
        private const val ALPHABET_COUNT = 26
        private const val MAX_ALLOWED_COMPLEXITY = 2
    }
}
