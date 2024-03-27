package boj.problems

import java.io.BufferedReader

class No20492 {
    fun solve(input: BufferedReader): String {
        val prize = input.readLine().toInt()
        val case1 = (prize * 0.78).toInt()
        val case2 = (prize * 0.8 + prize * 0.2 * 0.78).toInt()
        return "$case1 $case2"
    }
}
