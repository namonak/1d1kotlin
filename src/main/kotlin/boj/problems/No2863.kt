package boj.problems

import java.io.BufferedReader

class No2863 {
    fun solve(input: BufferedReader): String {
        val (a, b) = input.readLine().split(" ").map { it.toInt() }
        val (c, d) = input.readLine().split(" ").map { it.toInt() }

        // 회전별 값:
        // 0: A/C + B/D => (A*D + B*C) / (C*D)
        // 1: C/D + A/B => (C*B + A*D) / (D*B)
        // 2: D/B + C/A => (D*A + C*B) / (B*A)
        // 3: B/A + D/C => (B*C + D*A) / (A*C)
        val numer = longArrayOf(
            (a * d + b * c).toLong(),
            (c * b + a * d).toLong(),
            (d * a + c * b).toLong(),
            (b * c + d * a).toLong()
        )
        val denom = longArrayOf(
            (c * d).toLong(),
            (d * b).toLong(),
            (b * a).toLong(),
            (a * c).toLong()
        )

        var bestIdx = 0
        var bestN = numer[0]
        var bestM = denom[0]

        for (i in 1..3) {
            val left = numer[i] * bestM
            val right = bestN * denom[i]
            if (left > right) {
                bestIdx = i
                bestN = numer[i]
                bestM = denom[i]
            }
            // 동률이면 더 작은 회전 수(이미 bestIdx가 작음)를 유지
        }
        return bestIdx.toString()
    }
}
