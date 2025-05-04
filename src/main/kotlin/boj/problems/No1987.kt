package boj.problems

import java.io.BufferedReader

class No1987 {
    fun solve(input: BufferedReader): String {
        val (r, c) = input.readLine().split(" ").map(String::toInt)
        val board = Array(r) { input.readLine().toCharArray() }
        val visited = BooleanArray(ALPHABET_COUNT)

        fun dfs(x: Int, y: Int, count: Int): Int {
            if (x < 0 || x >= r || y < 0 || y >= c || visited[board[x][y] - BASE_CHAR]) {
                return count - 1
            }

            visited[board[x][y] - BASE_CHAR] = true

            val maxCount = maxOf(
                dfs(x + 1, y, count + 1),
                dfs(x - 1, y, count + 1),
                dfs(x, y + 1, count + 1),
                dfs(x, y - 1, count + 1)
            )

            visited[board[x][y] - BASE_CHAR] = false
            return maxCount
        }

        return dfs(0, 0, 1).toString()
    }

    private companion object {
        const val ALPHABET_COUNT = 26
        const val BASE_CHAR = 'A'
    }
}
