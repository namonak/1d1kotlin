package boj.problems

import java.io.BufferedReader
import kotlin.math.abs

class No18238 {
    fun solve(input: BufferedReader): String {
        val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        val inputString = input.readLine()
        var result = 0
        var current = 0
        for (i in inputString.indices) {
            val next = alphabet.indexOf(inputString[i])
            val diff = abs(next - current)
            result += diff.coerceAtMost(26 - diff)
            current = next
        }
        return result.toString()
    }
}
