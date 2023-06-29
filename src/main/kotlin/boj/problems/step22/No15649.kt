package boj.problems.step22

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No15649.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No15649 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val result = StringBuilder()
        backtrack(result, mutableListOf(), (1..n).toMutableList(), m)
        return result.toString()
    }

    private fun backtrack(result: StringBuilder, selected: MutableList<Int>, candidates: MutableList<Int>, m: Int) {
        if (selected.size == m) {
            result.append(selected.joinToString(" ")).append("\n")
            return
        }

        for (i in candidates.indices) {
            selected.add(candidates[i])
            val newCandidates = candidates.toMutableList()
            newCandidates.removeAt(i)
            backtrack(result, selected, newCandidates, m)
            selected.removeAt(selected.lastIndex)
        }
    }
}
