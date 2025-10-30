package boj.problems

import java.io.BufferedReader

class No16486 {
    fun solve(input: BufferedReader): String {
        val a = input.readLine().toInt()
        val b = input.readLine().toInt()

        return ((a * 2) + (b * 2 * PI)).toString()
    }

    private companion object {
        private const val PI = 3.141592
    }
}
