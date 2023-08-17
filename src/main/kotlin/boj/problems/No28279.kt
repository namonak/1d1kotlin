package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No28279.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No28279 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = StringBuilder()
        val deque = ArrayDeque<Int>()

        repeat(n) {
            executeOperation(input.readLine(), deque, result)
        }

        return result.toString().trimEnd()
    }

    private fun executeOperation(readLine: String, deque: ArrayDeque<Int>, result: StringBuilder) {
        val st = readLine.split(" ")
        when (st[0]) {
            "1" -> deque.addFirst(st[1].toInt())
            "2" -> deque.addLast(st[1].toInt())
            "3" -> result.append(if (deque.isEmpty()) "-1" else deque.removeFirst()).append("\n")
            "4" -> result.append(if (deque.isEmpty()) "-1" else deque.removeLast()).append("\n")
            "5" -> result.append(deque.size.toString()).append("\n")
            "6" -> result.append(if (deque.isEmpty()) "1" else "0").append("\n")
            "7" -> result.append(if (deque.isEmpty()) "-1" else deque.first()).append("\n")
            "8" -> result.append(if (deque.isEmpty()) "-1" else deque.last()).append("\n")
        }
    }
}
