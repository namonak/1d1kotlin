package boj.problems

import java.io.BufferedReader

class No16435 {
    fun solve(input: BufferedReader): String {
        var (_, length) = input.readLine().split(" ").map { it.toInt() }
        val heights = input.readLine().split(" ").map { it.toInt() }.sorted()

        for (height in heights) {
            if (height > length) {
                break
            }
            length += 1
        }

        return length.toString()
    }
}
