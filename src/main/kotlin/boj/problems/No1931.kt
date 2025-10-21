package boj.problems

import java.io.BufferedReader

class No1931 {
    fun solve(input: BufferedReader): String {
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
            }.size.toString()
    }
}
