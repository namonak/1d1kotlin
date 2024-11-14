package boj.problems

import java.io.BufferedReader

class No23080 {
    fun solve(input: BufferedReader): String {
        val k = input.readLine().toInt()
        val s = input.readLine()
        return s.filterIndexed { index, _ -> index % k == 0 }
    }
}
