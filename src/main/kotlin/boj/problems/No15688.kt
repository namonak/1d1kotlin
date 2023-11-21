package boj.problems

import java.io.BufferedReader
import java.util.Arrays

object No15688 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val numbers = IntArray(n) { input.readLine().toInt() }
        val sb = StringBuilder()

        Arrays.sort(numbers)
        numbers.forEach { sb.append("$it\n") }

        return sb.toString().trimEnd()
    }
}
