package boj.problems

import java.io.BufferedReader

class No16478 {
    fun solve(input: BufferedReader): String {
        val (pab, pbc, pcd) = input.readLine().split(" ").map { it.toDouble() }

        val pda = computePda(pab, pbc, pcd)
        return pda.toString()
    }

    private fun computePda(
        pab: Double,
        pbc: Double,
        pcd: Double
    ): Double {
        return (pab * pcd) / pbc
    }
}
