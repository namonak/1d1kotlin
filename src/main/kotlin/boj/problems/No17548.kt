package boj.problems

import java.io.BufferedReader

class No17548 {
    fun solve(input: BufferedReader): String {
        val s = input.readLine()
        val eCount = s.count { it == 'e' }
        return "h${"e".repeat(eCount * 2)}y"
    }
}
