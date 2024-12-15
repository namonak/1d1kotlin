package boj.problems

import java.io.BufferedReader

class No18698 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val results = mutableListOf<Int>()

        repeat(t) {
            val steps = input.readLine()
            val firstFall = steps.indexOf('D')
            results.add(if (firstFall == -1) steps.length else firstFall)
        }

        return results.joinToString("\n")
    }
}
