package boj.problems

import java.io.BufferedReader

class No5525 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val m = input.readLine().toInt()
        val s = input.readLine()

        var count = 0
        var patternCount = 0
        var i = 1
        while (i < m - 1) {
            if (s[i - 1] == 'I' && s[i] == 'O' && s[i + 1] == 'I') {
                patternCount++
                if (patternCount == n) {
                    patternCount--
                    count++
                }
                i += 2
            } else {
                patternCount = 0
                i++
            }
        }

        return count.toString()
    }
}
