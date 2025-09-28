package boj.problems

import java.io.BufferedReader

class No5738 {
    fun solve(input: BufferedReader): String {
        val out = StringBuilder()
        while (true) {
            val (a, d) = readInts(input) ?: break
            if (a == 0 && d == 0) break

            val attackers = readInts(input)!!
            val defenders = readInts(input)!!

            // 가장 앞선(골라인에 가장 가까운) 공격수
            val closestAttacker = attackers.minOrNull()!!

            // 수비수 중 두 번째로 가까운 선수 (정렬 후 인덱스 1)
            val secondClosestDefender = defenders.sorted()[1]

            out.append(if (isOffside(closestAttacker, secondClosestDefender)) "Y" else "N").append('\n')
        }
        return out.toString().trimEnd()
    }

    private fun isOffside(closestAttacker: Int, secondClosestDefender: Int): Boolean =
        closestAttacker < secondClosestDefender

    /**
     * 공백이 여러 개여도 안전하게 파싱. 라인이 비면 null 반환.
     */
    private fun readInts(br: BufferedReader): List<Int>? {
        val line = br.readLine() ?: return null
        val parts = line.trim().split(Regex("\\s+"))
        return parts.map { it.toInt() }
    }
}
