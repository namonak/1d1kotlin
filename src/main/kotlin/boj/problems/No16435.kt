package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No16435.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No16435 {
    fun solve(input: BufferedReader): Int {
        var (_, length) = input.readLine().split(" ").map { it.toInt() }
        val heights = input.readLine().split(" ").map { it.toInt() }.sorted()

        for (height in heights) {
            if (height > length) {
                break
            }
            length += 1
        }

        return length
    }
}
