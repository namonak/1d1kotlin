package boj.problems.step28

import java.io.BufferedReader
import java.util.PriorityQueue

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No11279.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No11279 {
    fun solve(input: BufferedReader): String {
        val count = input.readLine().toInt()
        val priorityQueue = PriorityQueue<Int>(compareByDescending { it })
        val result = mutableListOf<Int>()

        for (i in 0 until count) {
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
