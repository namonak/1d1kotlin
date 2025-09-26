package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No31798 {
    fun solve(input: BufferedReader): String {
        val (a, b, c) = input.readLine().split(" ").map { it.toInt() }

        val answer = when {
            c == 0 -> {
                // a + b = c^2 이므로 c = sqrt(a + b)
                val sum = a + b
                sqrt(sum.toDouble()).toInt() // 문제 보장: 항상 정수
            }
            a == 0 -> {
                // 0 + b = c^2 -> a = c^2 - b
                c * c - b
            }
            else -> {
                // a + 0 = c^2 -> b = c^2 - a
                c * c - a
            }
        }

        return answer.toString()
    }
}
