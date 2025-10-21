package boj.problems

import java.io.BufferedReader

class No3273 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val numbers = input.readLine().split(" ").map { it.toInt() }
        val x = input.readLine().toInt()

        val set = numbers.toSet()
        var count = 0
        for (i in numbers) {
            if (set.contains(x - i)) {
                count++
            }
        }

        return (count / 2).toString()
    }
}
