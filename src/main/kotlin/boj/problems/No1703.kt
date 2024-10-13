package boj.problems

import java.io.BufferedReader

class No1703 {
    fun solve(input: BufferedReader): String {
        val result = mutableListOf<Int>()

        while (true) {
            val branchorama = input.readLine().split(" ").map { it.toInt() }
            if (branchorama[0] == 0) break
            result.add(calculateLeaves(branchorama))
        }

        return result.joinToString("\n")
    }

    private fun calculateLeaves(branchorama: List<Int>): Int {
        val ageOfTree = branchorama[0]
        var leaves = 1

        for (i in 1 until ageOfTree * 2 step 2) {
            leaves *= branchorama[i]
            leaves -= branchorama[i + 1]
        }

        return leaves
    }
}
