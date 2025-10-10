package boj.problems

import java.io.BufferedReader

class No1012 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) {
            val (m, n, k) = input.readLine().split(" ").map { it.toInt() }
            val field = Array(n) { BooleanArray(m) }

            repeat(k) {
                val (x, y) = input.readLine().split(" ").map { it.toInt() }
                field[y][x] = true
            }

            var count = 0

            for (i in 0 until n) {
                for (j in 0 until m) {
                    if (field[i][j]) {
                        dfs(field, i, j)
                        count++
                    }
                }
            }
            result.appendLine(count)
        }

        return result.toString().trim()
    }

    private fun dfs(
        field: Array<BooleanArray>,
        x: Int,
        y: Int
    ) {
        if (x < 0 || x >= field.size || y < 0 || y >= field[0].size || !field[x][y]) {
            return
        }

        field[x][y] = false

        val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)
        for ((dx, dy) in directions) {
            dfs(field, x + dx, y + dy)
        }
    }
}
