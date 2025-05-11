package boj.problems

import java.io.BufferedReader

class No13414 {
    fun solve(input: BufferedReader): String {
        val (capacity, totalClicks) = input.readLine().split(" ").map { it.toInt() }
        val waitingQueue = LinkedHashSet<String>()

        repeat(totalClicks) {
            val studentId = input.readLine()
            if (waitingQueue.contains(studentId)) {
                waitingQueue.remove(studentId)
            }
            waitingQueue.add(studentId)
        }

        return waitingQueue
            .take(capacity)
            .joinToString(separator = "\n")
    }
}
