package boj.problems

import java.io.BufferedReader
import java.util.Scanner

class No15650 {
    private var n: Int = 0
    private var m: Int = 0
    private lateinit var arr: IntArray
    private val result = StringBuilder()

    fun solve(input: BufferedReader): String {
        val scanner = Scanner(input.readLine())

        n = scanner.nextInt()
        m = scanner.nextInt()
        arr = IntArray(m) { 0 }

        dfs(1, 0)

        return result.toString().trimEnd()
    }

    private fun dfs(
        start: Int,
        depth: Int
    ) {
        if (depth == m) {
            result.append(arr.joinToString(" ") + "\n")
            return
        }

        for (i in start..n) {
            arr[depth] = i
            dfs(i + 1, depth + 1)
        }
    }
}
