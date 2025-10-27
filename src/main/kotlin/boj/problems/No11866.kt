package boj.problems

import java.io.BufferedReader
import kotlin.collections.ArrayDeque

class No11866 {
    fun solve(input: BufferedReader): String {
        val (n, k) = input.readLine().split(" ").map { it.toInt() }
        val queue = ArrayDeque((1..n).toList())
        val result = IntArray(n)

        for (i in 0 until n) {
            repeat(k - 1) {
                queue.addLast(queue.removeFirst())
            }
            result[i] = queue.removeFirst()
        }

        return "<${result.joinToString(", ")}>"
    }
}
