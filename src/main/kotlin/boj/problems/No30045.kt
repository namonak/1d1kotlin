package boj.problems

import java.io.BufferedReader

class No30045 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var emoticonCount = 0

        repeat(n) {
            val sentence = input.readLine()
            if ("01" in sentence || "OI" in sentence) {
                emoticonCount++
            }
        }

        return emoticonCount.toString()
    }
}
