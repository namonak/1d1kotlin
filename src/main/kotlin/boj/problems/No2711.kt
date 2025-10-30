package boj.problems

import java.io.BufferedReader

class No2711 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()

        val number = input.readLine().toInt()
        repeat(number) {
            val (index, word) = input.readLine().split(" ")
            result.append(word.removeRange(index.toInt() - 1, index.toInt())).append("\n")
        }

        return result.toString().trim()
    }
}
