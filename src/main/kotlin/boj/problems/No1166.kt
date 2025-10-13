package boj.problems

import java.io.BufferedReader
import java.util.Locale

class No1166 {
    companion object {
        private const val MAX_ITERATION = 100
    }

    fun solve(input: BufferedReader): String {
        val (n, l, w, h) = input.readLine().split(" ").map { it.toLong() }

        // A의 상한선. min(l, w, h) 또는 max(l, w, h) 모두 가능합니다.
        val initialHi = minOf(l, w, h).toDouble()

        var lo = 0.0
        var hi = initialHi

        repeat(MAX_ITERATION) {
            val mid = (lo + hi) / 2.0
            // canFit 함수의 인자 순서도 N을 앞으로 보내 가독성을 높일 수 있습니다.
            if (canFit(n, l, w, h, mid)) {
                lo = mid
            } else {
                hi = mid
            }
        }

        // 스페셜 저지: 1e-9 허용 → 넉넉히 15자리로 출력
        return String.format(Locale.US, "%.15f", lo)
    }

    /**
     * 한 변 길이가 a인 정육면체 박스를 n개 이상 넣을 수 있는지 검증합니다.
     * (L/a) * (W/a) * (H/a) >= n 인지 확인합니다.
     * Double 타입으로 변환하여 곱하면 오버플로 걱정 없이 안전하게 계산할 수 있습니다.
     */
    private fun canFit(
        n: Long,
        l: Long,
        w: Long,
        h: Long,
        a: Double
    ): Boolean {
        if (a == 0.0) return true // a가 0이면 무한히 넣을 수 있으므로 true

        val countX = (l / a).toLong()
        val countY = (w / a).toLong()
        val countZ = (h / a).toLong()

        // Double의 표현 범위를 활용해 오버플로 없이 계산
        return countX.toDouble() * countY.toDouble() * countZ.toDouble() >= n
    }
}
