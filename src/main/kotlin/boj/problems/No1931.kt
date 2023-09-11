package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No1931.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No1931 {
    fun solve(input: BufferedReader): Int {
        val n = input.readLine().toInt()
        val meetings = mutableListOf<Pair<Int, Int>>()

        repeat(n) {
            val (start, end) = input.readLine().split(" ").map { it.toInt() }
            meetings.add(start to end)
        }

        return meetings.sortedWith(compareBy({ it.second }, { it.first }))
            .fold(mutableListOf<Pair<Int, Int>>()) { acc, meeting ->
                if (acc.isEmpty()) {
                    acc.add(meeting)
                } else {
                    if (acc.last().second <= meeting.first) {
                        acc.add(meeting)
                    }
                }
                acc
            }.size
    }
}
