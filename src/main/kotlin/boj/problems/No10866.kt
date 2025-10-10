package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No10866.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No10866 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = StringBuilder()
        val deque = ArrayDeque<Int>()

        repeat(n) {
            executeOperation(input.readLine(), deque, result)
        }

        return result.toString().trimEnd()
    }

    private fun executeOperation(
        readLine: String,
        deque: ArrayDeque<Int>,
        result: StringBuilder
    ) {
        val st = readLine.split(" ")
        when (st[0]) {
            "push_front" -> deque.addFirst(st[1].toInt())
            "push_back" -> deque.addLast(st[1].toInt())
            "pop_front" -> result.append(if (deque.isEmpty()) "-1" else deque.removeFirst()).append("\n")
            "pop_back" -> result.append(if (deque.isEmpty()) "-1" else deque.removeLast()).append("\n")
            "size" -> result.append(deque.size.toString()).append("\n")
            "empty" -> result.append(if (deque.isEmpty()) "1" else "0").append("\n")
            "front" -> result.append(if (deque.isEmpty()) "-1" else deque.first()).append("\n")
            "back" -> result.append(if (deque.isEmpty()) "-1" else deque.last()).append("\n")
        }
    }
}
