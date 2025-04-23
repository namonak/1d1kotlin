package boj.problems

import java.io.BufferedReader
import java.util.Locale

class No11466 {
    fun solve(input: BufferedReader): String {
        val (h, w) = input.readLine().split(" ").map { it.toDouble() }

        // 1) 가로로 3개
        val l1 = minOf(h, w / 3.0)
        // 2) 세로로 3개
        val l2 = minOf(w, h / 3.0)
        // 3) 2×2 격자에서 3개 사용
        val l3 = minOf(h / 2.0, w / 2.0)

        val ans = maxOf(l1, l2, l3)
        // 소수점 여섯 자리까지 출력 (특별 채점이므로 허용 오차 내에서 통과)
        return String.format(Locale.US, "%.6f", ans)
    }
}
