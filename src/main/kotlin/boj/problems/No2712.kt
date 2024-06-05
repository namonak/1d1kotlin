package boj.problems

import java.io.BufferedReader
import java.text.DecimalFormat

class No2712 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = StringBuilder()
        val df = DecimalFormat("0.0000")
        repeat(n) {
            val (value, unit) = input.readLine().split(" ")
            when (unit) {
                "kg" -> result.append("${df.format(value.toDouble() * 2.2046)} lb\n")
                "lb" -> result.append("${df.format(value.toDouble() * 0.4536)} kg\n")
                "l" -> result.append("${df.format(value.toDouble() * 0.2642)} g\n")
                "g" -> result.append("${df.format(value.toDouble() * 3.7854)} l\n")
            }
        }
        return result.toString().trim()
    }
}
