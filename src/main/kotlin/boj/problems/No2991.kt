package boj.problems

import java.io.BufferedReader

class No2991 {
    fun solve(input: BufferedReader): String {
        val (A, B, C, D) = input.readLine().split(" ").map { it.toInt() }
        val (P, M, N) = input.readLine().split(" ").map { it.toInt() }

        val period1 = A + B
        val period2 = C + D

        val pAttackCount = listOf(
            isAttackedByDog(P, A, period1),
            isAttackedByDog(P, C, period2)
        ).count { it }

        val mAttackCount = listOf(
            isAttackedByDog(M, A, period1),
            isAttackedByDog(M, C, period2)
        ).count { it }

        val nAttackCount = listOf(
            isAttackedByDog(N, A, period1),
            isAttackedByDog(N, C, period2)
        ).count { it }

        return buildString {
            appendLine(pAttackCount)
            appendLine(mAttackCount)
            appendLine(nAttackCount)
        }.trimEnd()
    }

    private fun isAttackedByDog(t: Int, aggressive: Int, period: Int): Boolean {
        val modVal = (t - 1) % period + 1
        return modVal in 1..aggressive
    }
}
