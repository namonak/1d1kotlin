package boj.problems

import java.io.BufferedReader

class No5568 {
    private val resultSet = mutableSetOf<String>()

    fun solve(input: BufferedReader): String {
        resultSet.clear()

        val n = input.readLine()?.toInt() ?: 0
        val k = input.readLine()?.toInt() ?: 0

        val cards = IntArray(n) { input.readLine().toInt() }
        val visited = BooleanArray(n)

        dfs(cards, visited, "", 0, k)

        return resultSet.size.toString()
    }

    private fun dfs(
        cards: IntArray,
        visited: BooleanArray,
        currentString: String,
        depth: Int,
        k: Int
    ) {
        if (depth == k) {
            resultSet.add(currentString)
            return
        }

        for (i in 0 until cards.size) {
            if (!visited[i]) {
                visited[i] = true
                dfs(cards, visited, currentString + cards[i].toString(), depth + 1, k)
                visited[i] = false
            }
        }
    }
}
