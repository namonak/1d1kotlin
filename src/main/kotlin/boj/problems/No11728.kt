package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No11728.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No11728 {
    fun solve(input: BufferedReader): String {
        val (_, _) = input.readLine().split(" ").map { it.toInt() }
        val a = input.readLine().split(" ").map { it.toInt() }
        val b = input.readLine().split(" ").map { it.toInt() }

        var i = 0
        var j = 0
        val result = StringBuilder()

        while (i < a.size && j < b.size) {
            result.append(if (a[i] < b[j]) a[i++] else b[j++]).append(" ")
        }

        while (i < a.size) {
            result.append(a[i++]).append(" ")
        }

        while (j < b.size) {
            result.append(b[j++]).append(" ")
        }

        return result.trimEnd().toString()
    }
}
