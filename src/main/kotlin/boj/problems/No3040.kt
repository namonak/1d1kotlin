package boj.problems

import java.io.BufferedReader

class No3040 {
    fun solve(input: BufferedReader): String {
        val dwarfs = Array(9) { input.readLine().toInt() }
        val totalSum = dwarfs.sum()

        for (i in 0 until 9) {
            for (j in i + 1 until 9) {
                if (totalSum - dwarfs[i] - dwarfs[j] == 100) {
                    return dwarfs.filterIndexed { index, _ -> index != i && index != j }.joinToString("\n")
                }
            }
        }

        return ""
    }
}
