package boj.problems

import java.io.BufferedReader

class No17219 {
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
            result.add(memo[url] ?: "")
        }

        return result.joinToString("\n")
    }
}
