package boj.problems

import java.io.BufferedReader

class No10974 {
    private lateinit var arr: Array<Int>
    private lateinit var visited: BooleanArray
    private val result = StringBuilder()

    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()

        arr = Array(n) { 0 }
        visited = BooleanArray(n) { false }

        permutation(n, 0)

        return result.toString().trimEnd()
    }

    private fun permutation(n: Int, depth: Int) {
        if (n == depth) {
            result.append(arr.joinToString(" ") + "\n")
            return
        }

        for (i in 0 until n) {
            if (visited[i]) continue

            visited[i] = true
            arr[depth] = i + 1
            permutation(n, depth + 1)
            visited[i] = false
        }
    }
}
