package boj.problems

import java.io.BufferedReader

class No11948 {
    companion object {
        private const val SCIENCE_SUBJECTS = 4
        private const val HISTORY_SUBJECTS = 2
        private const val DROP_LOWEST = 1
    }

    fun solve(input: BufferedReader): String {
        val scores = Array(SCIENCE_SUBJECTS + HISTORY_SUBJECTS) { input.readLine().toInt() }

        val scienceScore = scores.take(SCIENCE_SUBJECTS)
            .sortedDescending()
            .take(SCIENCE_SUBJECTS - DROP_LOWEST)
            .sum()
        val historyScore = scores.takeLast(HISTORY_SUBJECTS).maxOrNull() ?: 0

        return (scienceScore + historyScore).toString()
    }
}
