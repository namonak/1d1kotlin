package boj.problems

import java.io.BufferedReader

class No33689 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var count = 0
        repeat(n) {
            if (input.readLine().startsWith('C')) {
                count++
            }
        }
        return count.toString()
    }
}
