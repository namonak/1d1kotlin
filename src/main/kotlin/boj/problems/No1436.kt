package boj.problems

import java.io.BufferedReader

class No1436 {
    private companion object {
        const val DIGIT = 6
        const val STREAK_TARGET = 3
        const val START = 666
    }

    fun solve(input: BufferedReader): String {
        val n = input.readLine().trim().toInt()

        var found = 0
        var num = START
        while (true) {
            if (hasTripleSix(num)) {
                found++
                if (found == n) return num.toString()
            }
            num++
        }
    }

    // 문자열 변환 없이 자릿수만으로 666 연속 여부 판단
    private fun hasTripleSix(x: Int): Boolean {
        var n = x
        var streak = 0
        while (n > 0) {
            if (n % 10 == DIGIT) {
                streak++
                if (streak >= STREAK_TARGET) return true
            } else {
                streak = 0
            }
            n /= 10
        }
        return false
    }
}
