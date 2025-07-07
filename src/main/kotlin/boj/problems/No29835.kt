package boj.problems

import java.io.BufferedReader

class No29835 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val s = input.readLine().trim()
        val arr = s.toCharArray()
        var changes = 0

        for (i in 0 until n / 2) {
            val j = n - 1 - i
            if (arr[i] != arr[j]) {
                val minChar = if (arr[i] < arr[j]) arr[i] else arr[j]
                arr[i] = minChar
                arr[j] = minChar
                changes++
            }
        }

        return buildString {
            append(changes)
            append('\n')
            append(arr)
        }
    }
}
