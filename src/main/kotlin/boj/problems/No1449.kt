package boj.problems

import java.io.BufferedReader

class No1449 {
    fun solve(input: BufferedReader): String {
        val (_, l) = input.readLine().split(" ").map { it.toInt() }
        val holes = input.readLine().split(" ").map { it.toInt() }.sorted()
        var count = 0
        var last = 0
        holes.forEach {
            if (it > last) {
                count++
                last = it + l - 1
            }
        }
        return count.toString()
    }
}
