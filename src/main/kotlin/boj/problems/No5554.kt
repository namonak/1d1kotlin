package boj.problems

import java.io.BufferedReader

class No5554 {
    fun solve(input: BufferedReader): String {
        val sum = (1..4).sumOf { input.readLine().toInt() }
        return "${sum / 60}\n${sum % 60}"
    }
}
