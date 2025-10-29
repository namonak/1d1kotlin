package boj.problems

import java.io.BufferedReader

class No16499 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val words = mutableSetOf<String>()
        repeat(n) {
            words.add(input.readLine().toList().sorted().joinToString(""))
        }
        return words.size.toString()
    }
}
