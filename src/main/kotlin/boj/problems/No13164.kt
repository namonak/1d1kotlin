package boj.problems

import java.io.BufferedReader

class No13164 {
    fun solve(input: BufferedReader): String {
        val (n, k) = input.readLine().split(" ").map { it.toInt() }
        val children = input.readLine().split(" ").map { it.toInt() }
        val diffs = mutableListOf<Int>()
        for (i in 1 until n) {
            diffs.add(children[i] - children[i - 1])
        }
        diffs.sort()
        var answer = 0
        for (i in 0 until n - k) {
            answer += diffs[i]
        }
        return answer.toString()
    }
}
