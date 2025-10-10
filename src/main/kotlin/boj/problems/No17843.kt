package boj.problems

import java.io.BufferedReader
import java.util.Locale
import kotlin.math.abs
import kotlin.math.min

class No17843 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        val t = input.readLine().toInt()
        repeat(t) { idx ->
            // h: 시, m: 분, s: 초
            val (h, m, s) = input.readLine().split(" ").map { it.toDouble() }

            // 각도 계산
            val thetaSec = s * 6.0
            val thetaMin = m * 6.0 + s * 0.1
            val thetaHour = (h % 12) * 30.0 + m * 0.5 + s * (0.5 / 60.0)

            // 두 각도 사이의 최소 차이 (0° ~ 180°)
            fun angleDiff(
                a: Double,
                b: Double
            ): Double {
                val d = abs(a - b)
                return min(d, 360.0 - d)
            }

            // 세 쌍의 각도 차이 중 최소값
            val answer = minOf(
                angleDiff(thetaHour, thetaMin),
                angleDiff(thetaMin, thetaSec),
                angleDiff(thetaSec, thetaHour)
            )

            sb.append(String.format(Locale.US, "%.6f", answer))
            if (idx < t - 1) sb.append('\n')
        }
        return sb.toString()
    }
}
