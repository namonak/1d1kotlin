package boj.problems

import java.io.BufferedReader

class No15651 {
    private lateinit var arr: IntArray
    private val result = StringBuilder()

    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }

        arr = IntArray(m) { 0 }

        dfs(n, m, 0)

        return result.toString().trimEnd()
    }

    private fun dfs(n: Int, m: Int, depth: Int) {
        if (depth == m) {
            result.append(arr.joinToString(" ") + "\n")
            return
        }

        for (i in 1..n) {
            arr[depth] = i
            dfs(n, m, depth + 1)
        }
    }
}
