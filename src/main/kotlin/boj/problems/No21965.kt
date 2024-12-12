package boj.problems

import java.io.BufferedReader

class No21965 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val arr = input.readLine().split(" ").map { it.toInt() }

        if (n == 1) return "YES"

        var i = 0
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++
        }

        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++
        }

        return if (i == n - 1) "YES" else "NO"
    }
}
