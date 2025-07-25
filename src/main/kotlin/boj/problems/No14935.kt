package boj.problems

import java.io.BufferedReader

class No14935 {
    fun solve(input: BufferedReader): String {
        val x = input.readLine()
        val seen = mutableSetOf<String>()
        var current = x

        while (current !in seen) {
            seen += current
            current = F(current)
        }

        return "FA"
    }

    private fun F(x: String): String {
        val firstDigit = x[0].digitToInt()
        val length = x.length
        return (firstDigit * length).toString()
    }
}
