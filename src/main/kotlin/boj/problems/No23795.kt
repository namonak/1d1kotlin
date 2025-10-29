package boj.problems

import java.io.BufferedReader

class No23795 {
    fun solve(input: BufferedReader): String {
        var sum = 0
        while (true) {
            val n = input.readLine().toInt()
            if (n == -1) break
            sum += n
        }
        return sum.toString()
    }
}
