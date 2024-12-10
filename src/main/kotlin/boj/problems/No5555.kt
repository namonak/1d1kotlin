package boj.problems

import java.io.BufferedReader

class No5555 {
    fun solve(input: BufferedReader): String {
        val searchWord = input.readLine()
        val n = input.readLine().toInt()
        var count = 0

        repeat(n) {
            val ring = input.readLine()
            val extendedRing = ring + ring
            if (extendedRing.contains(searchWord)) {
                count++
            }
        }

        return count.toString()
    }
}
