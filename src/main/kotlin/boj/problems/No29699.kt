package boj.problems

import java.io.BufferedReader

object No29699 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val str = "WelcomeToSMUPC"

        return if (n % str.length == 0) str[str.length - 1].toString()
        else str[(n % str.length) - 1].toString()
    }
}
