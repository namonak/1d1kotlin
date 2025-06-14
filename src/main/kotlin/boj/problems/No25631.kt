package boj.problems

import java.io.BufferedReader

class No25631 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val sizes = input.readLine().split(" ").map { it.toInt() }
        val freq = mutableMapOf<Int, Int>()
        var maxCount = 0

        for (size in sizes) {
            val count = freq.getOrDefault(size, 0) + 1
            freq[size] = count
            if (count > maxCount) maxCount = count
        }

        return maxCount.toString()
    }
}
