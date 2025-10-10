package boj.problems

import java.io.BufferedReader

object No14720 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val stores = input.readLine().split(" ").map { it.toInt() }
        var count = 0
        var current = 0

        for (store in stores) {
            if (store == current) {
                count++
                current = (current + 1) % 3
            }
        }
        return count.toString()
    }
}
