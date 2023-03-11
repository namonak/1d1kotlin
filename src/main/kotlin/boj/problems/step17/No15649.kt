package boj.problems.step17

import java.io.IOException

class No15649(private val inputProcessor: InputProcessor, private val outputProcessor: OutputProcessor) {
    @Throws(IOException::class)
    fun solve(input: String): String {
        val (n, m) = inputProcessor.process(input)
        val output = generatePermutations(n, m)
        return outputProcessor.process(output)
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

class InputProcessor {
    fun process(input: String): Pair<Int, Int> {
        val (n, m) = input.split(" ").map { it.toInt() }
        return Pair(n, m)
    }
}

class OutputProcessor {
    fun process(output: List<List<Int>>): String {
        return output.joinToString("\n") { it.joinToString(" ") }
    }
}

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()
    val problem = No15649(InputProcessor(), OutputProcessor())

    output.write("${problem.solve(input.readLine())}\n")

    input.close()
    output.flush()
    output.close()
}
