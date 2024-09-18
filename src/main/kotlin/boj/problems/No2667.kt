package boj.problems

import java.io.BufferedReader

class No2667 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val map = Array(n) { input.readLine().map { it - '0' }.toIntArray() }
        val direction = arrayOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)
        val visited = Array(n) { BooleanArray(n) }
        val houseCounts = mutableListOf<Int>()


        fun dfs(x: Int, y: Int): Int {
            visited[x][y] = true
            var count = 1

            for ((dx, dy) in direction) {
                val nx = x + dx
                val ny = y + dy

                if (nx in 0 until n && ny in 0 until n && !visited[nx][ny] && map[nx][ny] == 1) {
                    count += dfs(nx, ny)
                }
            }
            return count
        }

        for (i in 0 until n) {
            for (j in 0 until n) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    val houseCount = dfs(i, j)
                    houseCounts.add(houseCount)
                }
            }
        }

        return "${houseCounts.size}\n${houseCounts.sorted().joinToString("\n")}"
    }
}
