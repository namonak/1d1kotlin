package boj.problems

import java.io.BufferedReader
import java.util.PriorityQueue

class No1927 {
    fun solve(input: BufferedReader): String {
        val count = input.readLine().toInt()
        val priorityQueue = PriorityQueue<Int>()
        val result = mutableListOf<Int>()

        repeat(count) {
            val number = input.readLine().toInt()
            if (number == 0) {
                if (priorityQueue.isEmpty()) {
                    result.add(0)
                } else {
                    result.add(priorityQueue.poll())
                }
            } else {
                priorityQueue.add(number)
            }
        }

        return result.joinToString("\n")
    }
}
