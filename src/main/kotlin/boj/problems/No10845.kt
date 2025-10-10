package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No10845.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No10845 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = StringBuilder()
        val queue = ArrayDeque<Int>()

        repeat(n) {
            executeOperation(input.readLine(), queue, result)
        }

        return result.toString().trimEnd()
    }

    private fun executeOperation(
        readLine: String,
        queue: ArrayDeque<Int>,
        result: StringBuilder
    ) {
        val st = readLine.split(" ")
        when (st[0]) {
            "push" -> queue.addLast(st[1].toInt())
            "pop" -> result.append(if (queue.isEmpty()) "-1" else queue.removeFirst()).append("\n")
            "size" -> result.append(queue.size.toString()).append("\n")
            "empty" -> result.append(if (queue.isEmpty()) "1" else "0").append("\n")
            "front" -> result.append(if (queue.isEmpty()) "-1" else queue.first()).append("\n")
            "back" -> result.append(if (queue.isEmpty()) "-1" else queue.last()).append("\n")
        }
    }
}
