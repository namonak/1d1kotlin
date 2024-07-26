package boj.problems

import java.io.BufferedReader

class No4388 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        while (true) {
            var (a, b) = input.readLine().split(" ").map { it.toInt() }
            if (a == 0 && b == 0) break
            var carry = 0
            var count = 0
            while (a > 0 || b > 0) {
                val sum = a % 10 + b % 10 + carry
                if (sum >= 10) {
                    carry = 1
                    count++
                } else {
                    carry = 0
                }
                a /= 10
                b /= 10
            }
            sb.appendLine(count)
        }
        return sb.toString().trim()
    }
}
