package boj.problems

import java.io.BufferedReader
import kotlin.math.abs

class No14400 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().trim().toInt()
        val xs = IntArray(n)
        val ys = IntArray(n)

        repeat(n) { i ->
            val (x, y) = input.readLine().split(" ").map { it.toInt() }
            xs[i] = x
            ys[i] = y
        }

        xs.sort()
        ys.sort()

        // 짝수 n에서는 n/2와 n/2-1 모두 중앙값 구간에 해당. 임의로 상위 중앙값을 사용.
        val medianX = xs[n / 2]
        val medianY = ys[n / 2]

        var sum = 0L
        for (i in 0 until n) {
            sum += abs(xs[i] - medianX).toLong()
            sum += abs(ys[i] - medianY).toLong()
        }

        return sum.toString()
    }
}
