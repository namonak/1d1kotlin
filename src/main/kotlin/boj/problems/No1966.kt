package boj.problems

import java.io.BufferedReader

class No1966 {
    fun solve(input: BufferedReader): String {
        val caseCount = input.readLine().toInt()
        val result = StringBuilder()

        repeat(caseCount) {
            val (_, targetIndex) = input.readLine().split(" ").map { it.toInt() }
            val docs = input.readLine().split(" ").map { it.toInt() }
            val queue = docs.mapIndexed { index, priority -> index to priority }.toMutableList()

            var count = 0
            while (queue.isNotEmpty()) {
                val maxPriority = queue.maxOf { it.second }
                val (index, priority) = queue.removeFirst()

                if (priority == maxPriority) {
                    count++
                    if (index == targetIndex) {
                        result.append("$count\n")
                        break
                    }
                } else {
                    queue.add(index to priority)
                }
            }
        }

        return result.toString().trimEnd()
    }
}
