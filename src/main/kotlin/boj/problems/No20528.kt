package boj.problems

import java.io.BufferedReader

class No20528 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val words = input.readLine().split(" ")

        val firstChar = words.first()[0]
        val isAllSame = words.all { it.first() == firstChar }

        return if (isAllSame) "1" else "0"
    }
}
