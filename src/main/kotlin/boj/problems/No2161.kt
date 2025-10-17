package boj.problems

import java.io.BufferedReader
import java.util.LinkedList
import java.util.Queue

class No2161 {
    fun solve(input: BufferedReader): String {
        val number = input.readLine().toInt()
        val q: Queue<Int> = LinkedList<Int>()
        for (i in 1..number) {
            q.offer(i)
        }

        val sb = StringBuilder()
        while (!q.isEmpty()) {
            sb.append(q.poll()).append(" ")
            if (q.isEmpty()) {
                break
            }
            q.offer(q.poll())
        }

        return sb.toString().trim()
    }
}
