package boj.problems

import java.io.BufferedReader

class No15649 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val output = generatePermutations(n, m)
        return output.joinToString("\n") { it.joinToString(" ") }
    }

    private fun generatePermutations(n: Int, m: Int): List<List<Int>> {
        val permutations = mutableListOf<List<Int>>()
        val numbers = (1..n).toList()
        val visited = BooleanArray(n) { false }
        val permutation = mutableListOf<Int>()

        fun dfs(depth: Int) {
            if (depth == m) {
                permutations.add(permutation.toList())
                return
            }

            for (i in numbers.indices) {
                if (visited[i]) continue
                visited[i] = true
                permutation.add(numbers[i])
                dfs(depth + 1)
                visited[i] = false
                permutation.removeAt(permutation.lastIndex)
            }
        }

        dfs(0)
        return permutations
    }
}
