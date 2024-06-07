package boj.problems

import java.io.BufferedReader

class No30454 {
    fun solve(input: BufferedReader): String {
        val (n, _) = input.readLine().split(" ").map { it.toInt() }
        var maxBlackStripes = 0
        var count = 0

        repeat(n) {
            val zebra = input.readLine()
            var currentStripes = 0
            var maxCurrentStripes = 0

            for (i in zebra.indices) {
                if (zebra[i] == '1') {
                    if (i == 0 || zebra[i - 1] == '0') {
                        currentStripes++
                    }
                }
            }

            maxCurrentStripes = currentStripes

            if (maxCurrentStripes > maxBlackStripes) {
                maxBlackStripes = maxCurrentStripes
                count = 1
            } else if (maxCurrentStripes == maxBlackStripes) {
                count++
            }
        }

        return "$maxBlackStripes $count"
    }
}
