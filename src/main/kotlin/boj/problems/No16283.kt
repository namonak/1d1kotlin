package boj.problems

import java.io.BufferedReader

class No16283 {
    fun solve(input: BufferedReader): String {
        val (a, b, n, w) = input.readLine().split(" ").map { it.toInt() }
        var found = 0
        var ansS = -1
        var ansG = -1

        for (s in 1 until n) { // s: 양 마리 수
            val g = n - s // g: 염소 마리 수
            if (a.toLong() * s + b.toLong() * g == w.toLong()) {
                found++
                ansS = s
                ansG = g
                if (found > 1) break // 두 개 이상이면 더 볼 필요 없음
            }
        }

        return if (found == 1) "$ansS $ansG" else "-1"
    }
}
