package boj.problems

import java.io.BufferedReader

object No1158 {
    fun solve(input: BufferedReader): String {
        val (n, k) = input.readLine().split(" ").map { it.toInt() }
        val queue = (1..n).toMutableList()
        val result = mutableListOf<Int>()
        var index = 0

        while (queue.isNotEmpty()) {
            index = (index + k - 1) % queue.size
            result.add(queue.removeAt(index))
        }

        return "<${result.joinToString(", ")}>"
    }
}
