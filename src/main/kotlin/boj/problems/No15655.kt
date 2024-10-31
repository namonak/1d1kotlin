package boj.problems

import java.io.BufferedReader
import java.util.Scanner

class No15655 {
    private var n: Int = 0
    private var m: Int = 0
    private lateinit var numbers: IntArray
    private lateinit var arr: IntArray
    private lateinit var visited: BooleanArray
    private val result = StringBuilder()

    fun solve(input: BufferedReader): String {
        val scanner = Scanner(input.readLine())

        n = scanner.nextInt()
        m = scanner.nextInt()
        numbers = input.readLine().split(" ").map { it.toInt() }.sorted().toIntArray()
        arr = IntArray(m) { 0 }
        visited = BooleanArray(n) { false }

        dfs(0, 0)

        return result.toString().trimEnd()
    }

    private fun dfs(depth: Int, start: Int) {
        if (depth == m) {
            result.append(arr.joinToString(" ") + "\n")
            return
        }

        for (i in start until n) {
            if (visited[i]) continue

            visited[i] = true
            arr[depth] = numbers[i]
            dfs(depth + 1, i)
            visited[i] = false
        }
    }
}
