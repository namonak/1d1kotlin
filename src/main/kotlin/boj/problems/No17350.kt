package boj.problems

import java.io.BufferedReader

class No17350 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        repeat(n) {
            if (input.readLine() == "anj") {
                return "뭐야;"
            }
        }
        return "뭐야?"
    }
}
