package boj.problems

import java.util.LinkedList
import java.util.Queue

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2161.solve(input.readLine().toInt()))

    input.close()
    output.flush()
    output.close()
}

object No2161 {
    fun solve(number: Int): String {
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
