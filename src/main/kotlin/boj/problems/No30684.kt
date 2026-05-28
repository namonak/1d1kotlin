package boj.problems

import java.io.BufferedReader

private const val TARGET_LENGTH = 3

class No30684 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().trim().toInt()

        var best: String? = null
        repeat(n) {
            val name = input.readLine().trim()
            val currentBest = best
            if (name.length == TARGET_LENGTH && (currentBest == null || name < currentBest)) {
                best = name
            }
        }

        // 문제 보장: 3글자 이름이 반드시 존재
        return requireNotNull(best)
    }
}
