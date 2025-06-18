package boj.problems

import java.io.BufferedReader

class No11586 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val lines = List(n) { input.readLine() }
        val k = input.readLine().toInt()
        val result = when (k) {
            1 -> lines
            2 -> lines.map { it.reversed() }
            3 -> lines.reversed()
            else -> lines // 유효하지 않은 K는 없지만 안전하게 처리
        }
        return result.joinToString("\n")
    }
}
