package boj.problems

import java.io.BufferedReader

class No1065 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var count = 0
        for (i in 1..n) {
            if (isHanSu(i)) {
                count++
            }
        }
        return count.toString()
    }

    private fun isHanSu(number: Int): Boolean {
        if (number < 100) {
            return true
        }
        val digits = number.toString().map { it.toString().toInt() }
        val diff = digits[0] - digits[1]
        for (i in 1 until digits.size - 1) {
            if (digits[i] - digits[i + 1] != diff) {
                return false
            }
        }
        return true
    }
}
