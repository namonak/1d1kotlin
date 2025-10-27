package boj.problems

import java.io.BufferedReader

class No2164 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val queue = ArrayDeque<Int>()

        for (i in 1..n) {
            queue.add(i)
        }

        while (queue.size > 1) {
            queue.removeFirst()
            queue.add(queue.removeFirst())
        }

        return queue.first().toString()
    }
}
