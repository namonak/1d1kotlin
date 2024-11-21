package boj.problems

import java.io.BufferedReader
import kotlin.math.abs
import kotlin.math.pow

class No4619 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        while (true) {
            val (b, n) = input.readLine().split(" ").map { it.toInt() }
            if (b == 0 && n == 0) break

            var num1: Int
            var num2: Int
            var a = 0.0

            while (true) {
                if (a.pow(n) > b) {
                    num1 = abs(b - a.pow(n).toInt())
                    num2 = abs(b - a.minus(1).pow(n).toInt())
                    break
                }
                a++
            }

            sb.appendLine(if (num1 < num2) a.toInt() else a.minus(1).toInt())
        }
        return sb.toString().trimEnd()
    }
}
