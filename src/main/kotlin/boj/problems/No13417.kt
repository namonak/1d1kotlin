package boj.problems

import java.io.BufferedReader

class No13417 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val sb = StringBuilder()
        repeat(t) {
            val n = input.readLine().toInt()
            val cards = input.readLine().split(" ")
            val result = mutableListOf(cards[0])
            for (i in 1 until n) {
                if (cards[i] <= result.first()) {
                    result.add(0, cards[i])
                } else {
                    result.add(cards[i])
                }
            }
            sb.appendLine(result.joinToString(""))
        }
        return sb.toString().trimEnd()
    }
}
