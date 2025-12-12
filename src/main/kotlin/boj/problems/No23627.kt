package boj.problems

import java.io.BufferedReader

class No23627 {
    fun solve(input: BufferedReader): String {
        val inputString = input.readLine()

        val isCute = inputString.endsWith("driip")

        return if (isCute) "cute" else "not cute"
    }
}
