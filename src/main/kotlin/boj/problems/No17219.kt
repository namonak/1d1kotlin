package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No17219.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No17219 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val memo = HashMap<String, String>(n)
        val result = mutableListOf<String>()

        repeat(n) {
            val (url, password) = input.readLine().split(" ")
            memo[url] = password
        }

        repeat(m) {
            val url = input.readLine()
            result.add(memo[url]!!)
        }

        return result.joinToString("\n")
    }
}
