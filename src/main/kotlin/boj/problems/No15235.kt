package boj.problems

import java.io.BufferedReader
import java.util.LinkedList
import java.util.Queue

class No15235 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val slicesNeeded = input.readLine().split(" ").map { it.toInt() }
        val finishTime = IntArray(n)
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        for (i in 0 until n) {
            queue.add(Pair(i, slicesNeeded[i]))
        }

        var time = 0
        while (queue.isNotEmpty()) {
            time++
            val (index, remaining) = queue.poll()
            val newRemaining = remaining - 1
            if (newRemaining == 0) {
                finishTime[index] = time
            } else {
                queue.add(Pair(index, newRemaining))
            }
        }
        return finishTime.joinToString(" ")
    }
}
