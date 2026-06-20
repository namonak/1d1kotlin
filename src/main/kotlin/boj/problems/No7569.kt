package boj.problems

import java.io.BufferedReader

class No7569 {
    private val directions = arrayOf(
        Triple(-1, 0, 0),
        Triple(1, 0, 0),
        Triple(0, -1, 0),
        Triple(0, 1, 0),
        Triple(0, 0, -1),
        Triple(0, 0, 1),
    )

    fun solve(input: BufferedReader): String {
        val (_, n, h) = input.readLine().split(" ").map { it.toInt() }
        val tomatoes = Array(h) { Array(n) { input.readLine().split(" ").map { it.toInt() }.toIntArray() } }

        ripenTomatoes(tomatoes, findRipeTomatoes(tomatoes))

        val maxDay = tomatoes.flatMap { it.flatMap { tomato -> tomato.asList() } }.maxOrNull() ?: 0
        return if (tomatoes.any { it.any { tomato -> tomato.contains(0) } }) "-1" else "${maxDay - 1}"
    }

    private fun findRipeTomatoes(tomatoes: Array<Array<IntArray>>): ArrayDeque<Triple<Int, Int, Int>> {
        val queue = ArrayDeque<Triple<Int, Int, Int>>()

        for (z in tomatoes.indices) {
            for (y in tomatoes[z].indices) {
                for (x in tomatoes[z][y].indices) {
                    if (tomatoes[z][y][x] == 1) {
                        queue.add(Triple(z, y, x))
                    }
                }
            }
        }

        return queue
    }

    private fun ripenTomatoes(
        tomatoes: Array<Array<IntArray>>,
        queue: ArrayDeque<Triple<Int, Int, Int>>
    ) {
        while (queue.isNotEmpty()) {
            val (z, y, x) = queue.removeFirst()

            for ((dz, dy, dx) in directions) {
                val nz = z + dz
                val ny = y + dy
                val nx = x + dx

                if (canRipen(tomatoes, nz, ny, nx)) {
                    tomatoes[nz][ny][nx] = tomatoes[z][y][x] + 1
                    queue.add(Triple(nz, ny, nx))
                }
            }
        }
    }

    private fun canRipen(
        tomatoes: Array<Array<IntArray>>,
        z: Int,
        y: Int,
        x: Int
    ): Boolean {
        return z in tomatoes.indices &&
            y in tomatoes[z].indices &&
            x in tomatoes[z][y].indices &&
            tomatoes[z][y][x] == 0
    }
}
