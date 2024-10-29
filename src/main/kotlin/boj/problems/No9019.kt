package boj.problems

import java.io.BufferedReader

class No9019 {
    data class Node(val number: Int, val instruction: String)

    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()
        repeat(t) {
            val (a, b) = input.readLine().split(" ").map { it.toInt() }
            result.append(DSLR(a, b)).append("\n")
        }
        return result.toString().trimEnd()
    }

    private fun DSLR(a: Int, b: Int): String {
        val visited = BooleanArray(10000) { false }
        val queue = ArrayDeque<Node>()

        queue.add(Node(a, ""))
        visited[a] = true

        while (queue.isNotEmpty()) {
            val (number, instruction) = queue.removeFirst()

            if (number == b) {
                return instruction
            }

            val d = if ((number * 2) > 9999) (number * 2) % 10000 else number * 2
            val s = if (number == 0) 9999 else number - 1
            val l = (number % 1000) * 10 + number / 1000
            val r = (number % 10) * 1000 + number / 10

            if (!visited[d]) {
                visited[d] = true
                queue.add(Node(d, instruction + "D"))
            }
            if (!visited[s]) {
                visited[s] = true
                queue.add(Node(s, instruction + "S"))
            }
            if (!visited[l]) {
                visited[l] = true
                queue.add(Node(l, instruction + "L"))
            }
            if (!visited[r]) {
                visited[r] = true
                queue.add(Node(r, instruction + "R"))
            }
        }

        return ""
    }
}
