package boj.problems.step16

import kotlin.collections.ArrayDeque

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No11866.solve(input.readLine()))

    input.close()
    output.flush()
    output.close()
}

object No11866 {
    fun solve(input: String): String {
        val (n, k) = input.split(" ").map { it.toInt() }
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
