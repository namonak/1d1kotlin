package boj.problems

import java.io.BufferedReader

object No1225 {
    fun solve(input: BufferedReader): String {
        val (a, b) = input.readLine().split(" ")
        var result = 0L
        for (charA in a) {
            for (charB in b) {
                result += (charA - '0') * (charB - '0')
            }
        }

        return result.toString()
    }
}
