package boj.problems.step5

import java.io.BufferedReader

object No27866 {
    fun solve(input: BufferedReader): String {
        val word = input.readLine()
        val index = input.readLine().toInt()

        return word[index - 1].toString()
    }
}
