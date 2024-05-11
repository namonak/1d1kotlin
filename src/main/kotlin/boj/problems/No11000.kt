package boj.problems

import java.io.BufferedReader

class No11000 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val lessons = List(n) {
            val (start, end) = input.readLine().split(" ").map { it.toInt() }
            start to end
        }.sortedBy { it.first }

        val pq = java.util.PriorityQueue<Int>()
        pq.add(lessons[0].second)

        for (i in 1 until n) {
            if (pq.peek() <= lessons[i].first) {
                pq.poll()
            }
            pq.add(lessons[i].second)
        }

        return pq.size.toString()
    }
}
