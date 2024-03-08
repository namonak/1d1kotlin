package boj.problems

import java.io.BufferedReader

class No14244 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val result = StringBuilder()

        var currentNode = 0
        var count = m - 1
        for (i in 1 until n) {
            result.append("$currentNode $i\n")
            currentNode += 1
            if (count > 0) {
                currentNode -= 1
                count -= 1
            }
        }

        return result.toString().trimEnd()
    }
}
