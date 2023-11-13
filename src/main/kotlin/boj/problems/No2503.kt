package boj.problems

import java.io.BufferedReader

object No2503 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val numbers = mutableListOf<Int>()
        val strikes = mutableListOf<Int>()
        val balls = mutableListOf<Int>()
        repeat(n) {
            val (number, strike, ball) = input.readLine().split(" ").map { it.toInt() }
            numbers.add(number)
            strikes.add(strike)
            balls.add(ball)
        }

        var answer = 0
        for (i in 123..987) {
            val (a, b, c) = i.toString().map { it - '0' }
            if (a == b || b == c || c == a) continue
            if (a == 0 || b == 0 || c == 0) continue

            var count = 0
            for (j in 0 until n) {
                val (number, strike, ball) = Triple(numbers[j], strikes[j], balls[j])
                val (x, y, z) = number.toString().map { it - '0' }
                var strikeCount = 0
                var ballCount = 0
                if (a == x) strikeCount++
                if (b == y) strikeCount++
                if (c == z) strikeCount++
                if (a == y || a == z) ballCount++
                if (b == x || b == z) ballCount++
                if (c == x || c == y) ballCount++
                if (strikeCount == strike && ballCount == ball) count++
            }
            if (count == n) answer++
        }
        return answer.toString()
    }
}
