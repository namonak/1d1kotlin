package boj.problems

import java.io.BufferedReader

class No9237 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val trees = input.readLine().split(" ").map { it.toInt() }.sortedDescending()
        var max = 0
        for (i in trees.indices) {
            max = maxOf(max, trees[i] + i + 2)
        }
        return max.toString()
    }
}
