package boj.problems

import java.io.BufferedReader

object No1075 {
    fun solve(input: BufferedReader): String {
        val number = input.readLine().toInt()
        val divisor = input.readLine().toInt()
        val baseNumber = (number / 100) * 100
        var remainder = 0

        for (i in 0 until 100) {
            if ((baseNumber + i) % divisor == 0) {
                remainder = i
                break
            }
        }

        return String.format("%02d", remainder)
    }
}
