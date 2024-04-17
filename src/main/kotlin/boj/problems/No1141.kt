package boj.problems

import java.io.BufferedReader

class No1141 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val words = mutableListOf<String>()
        repeat(n) {
            words.add(input.readLine())
        }
        words.sort()
        var count = 0
        for (i in 0 until n) {
            if (i == n - 1 || !words[i + 1].startsWith(words[i])) {
                count++
            }
        }
        return count.toString()
    }
}
