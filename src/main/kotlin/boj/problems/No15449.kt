package boj.problems

import java.io.BufferedReader

class No15449 {
    fun solve(input: BufferedReader): String {
        val sticks = input.readLine().split(" ").map { it.toInt() }.sorted()
        var count = 0

        for (i in 0 until 3) {
            for (j in i + 1 until 4) {
                for (k in j + 1 until 5) {
                    val a = sticks[i]
                    val b = sticks[j]
                    val c = sticks[k]
                    if (a + b > c) {
                        count++
                    }
                }
            }
        }

        return count.toString()
    }
}
