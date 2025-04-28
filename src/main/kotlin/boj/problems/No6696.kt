package boj.problems

import java.io.BufferedReader
import kotlin.math.PI
import kotlin.math.ceil

class No6696 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        while (true) {
            val (x, y) = input.readLine().split(" ").map { it.toDouble() }
            if (x == 0.0 && y == 0.0) break

            // 원점으로부터의 거리 제곱
            val dist2 = x * x + y * y
            // 반원 면적 50t = ½πr² 이므로
            // 최초 침수 시간 Z = ceil(π * dist2 / 100)
            val hour = ceil(PI * dist2 / 100.0).toInt()

            sb.append("The property will be flooded in hour $hour.\n")
        }
        return sb.toString().trimEnd()
    }
}
