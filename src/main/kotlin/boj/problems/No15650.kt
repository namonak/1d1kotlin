package boj.problems

import java.io.BufferedReader

class No15650 {
    private lateinit var arr: Array<Int>
    private lateinit var visited: BooleanArray
    private val result = StringBuilder()

    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }

        arr = Array(m) { 0 }
        visited = BooleanArray(n) { false }

        dfs(n, m, 0)

        return result.toString().trimEnd()
    }

    private fun dfs(n: Int, m: Int, depth: Int) {
        if (depth == m) {
            if (arr.sorted() != arr.toList()) return
            result.append(arr.joinToString(" ") + "\n")
            return
        }

        for (i in 0 until n) {
            if (!visited[i]) {
                visited[i] = true
                arr[depth] = i + 1
                dfs(n, m, depth + 1)
                visited[i] = false
            }
        }
    }
}
