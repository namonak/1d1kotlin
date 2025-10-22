package boj.problems

import java.io.BufferedReader

class No27866 {
    fun solve(input: BufferedReader): String {
        val word = input.readLine()
        val index = input.readLine().toInt()

        return word[index - 1].toString()
    }
}
