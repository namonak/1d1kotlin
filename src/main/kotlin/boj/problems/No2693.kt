package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2693.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No2693 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = IntArray(n)

        repeat(n) { it ->
            val array = input.readLine().split(" ").map { it.toInt() }
            result[it] = array.sortedDescending()[2]
        }

        return result.joinToString("\n")
    }
}
