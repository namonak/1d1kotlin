package boj.problems

import java.io.BufferedReader

class No7569 {
    fun solve(input: BufferedReader): String {
        val (m, n, h) = input.readLine().split(" ").map { it.toInt() }
        val tomatoes = Array(h) { Array(n) { input.readLine().split(" ").map { it.toInt() }.toIntArray() } }
        val directions = arrayOf(
            Triple(-1, 0, 0),
            Triple(1, 0, 0),
            Triple(0, -1, 0),
            Triple(0, 1, 0),
            Triple(0, 0, -1),
            Triple(0, 0, 1),
        )
        val queue = ArrayDeque<Triple<Int, Int, Int>>()

        for (i in 0 until h) {
            for (j in 0 until n) {
                for (k in 0 until m) {
                    if (tomatoes[i][j][k] == 1) {
                        queue.add(Triple(i, j, k))
                    }
                }
            }
        }

        while (queue.isNotEmpty()) {
            val (z, y, x) = queue.removeFirst()

            for ((dz, dy, dx) in directions) {
                val nz = z + dz
                val ny = y + dy
                val nx = x + dx

                if (nz in 0 until h && ny in 0 until n && nx in 0 until m && tomatoes[nz][ny][nx] == 0) {
                    tomatoes[nz][ny][nx] = tomatoes[z][y][x] + 1
                    queue.add(Triple(nz, ny, nx))
                }
            }
        }

        val maxDay = tomatoes.flatMap { it.flatMap { tomato -> tomato.asList() } }.maxOrNull() ?: 0

        return if (tomatoes.any { it.any { tomato -> tomato.contains(0) } }) "-1" else "${maxDay - 1}"
    }
}
