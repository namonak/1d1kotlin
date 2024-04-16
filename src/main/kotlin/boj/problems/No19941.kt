package boj.problems

import java.io.BufferedReader

class No19941 {
    fun solve(input: BufferedReader): String {
        val (n, k) = input.readLine().split(" ").map { it.toInt() }
        val seats = input.readLine()
        val visited = BooleanArray(n)
        var count = 0

        for (i in 0 until n) {
            if (seats[i] == 'P') {
                for (j in -k..k) {
                    if (i + j >= n) break
                    if (i + j < 0) continue

                    if (seats[i + j] == 'H' && !visited[i + j]) {
                        visited[i + j] = true
                        count += 1
                        break
                    }
                }
            }
        }

        return count.toString()
    }
}
