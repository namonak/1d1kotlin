package boj.problems

import java.io.BufferedReader
import java.util.ArrayDeque

class No16928 {
    fun solve(input: BufferedReader): String {
        val (ladderCount, snakeCount) = input.readLine().split(" ").map { it.toInt() }
        val board = IntArray(101) { it }
        // 사다리와 뱀 정보를 board에 반영합니다.
        repeat(ladderCount + snakeCount) {
            val (from, to) = input.readLine().split(" ").map { it.toInt() }
            board[from] = to
        }

        val queue = ArrayDeque<Int>()
        queue.add(1)
        val visited = BooleanArray(101)
        visited[1] = true

        var count = 0
        while (queue.isNotEmpty()) {
            val size = queue.size
            repeat(size) {
                val current = queue.removeFirst()
                if (current == 100) return count.toString()
                for (i in 1..6) {
                    if (current + i > 100) continue
                    val next = board[current + i]
                    if (!visited[next]) {
                        visited[next] = true
                        queue.add(next)
                    }
                }
            }
            count++
        }
        return "0"
    }
}
