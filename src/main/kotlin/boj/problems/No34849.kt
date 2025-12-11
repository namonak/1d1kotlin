package boj.problems

import java.io.BufferedReader

class No34849 {
    fun solve(input: BufferedReader): String {
        val loopCount = input.readLine().trim().toLong()

        return if (canFinishWithinOneSecond(loopCount)) {
            "Accepted"
        } else {
            "Time limit exceeded"
        }
    }

    private fun canFinishWithinOneSecond(loopCount: Long): Boolean {
        val totalOperations = loopCount * loopCount
        return totalOperations <= OPERATIONS_PER_SECOND
    }

    private companion object {
        private const val OPERATIONS_PER_SECOND: Long = 100_000_000L
    }
}
