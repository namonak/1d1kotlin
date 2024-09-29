package boj.problems

import java.io.BufferedReader

class No6593 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()

        while (true) {
            val (l, r, c) = input.readLine().split(" ").map { it.toInt() }
            if (l == 0 && r == 0 && c == 0) break

            val building = Array(l) { Array(r) { CharArray(c) } }
            var start = Triple(0, 0, 0)
            var end = Triple(0, 0, 0)

            for (floor in 0 until l) {
                for (row in 0 until r) {
                    val line = input.readLine()
                    building[floor][row] = line.toCharArray()
                    for (col in line.indices) {
                        when (line[col]) {
                            'S' -> start = Triple(floor, row, col)
                            'E' -> end = Triple(floor, row, col)
                        }
                    }
                }
                input.readLine()
            }
            result.append(bfs(building, start, end, l, r, c))
        }

        return result.toString().trimEnd()
    }

    private fun bfs(building: Array<Array<CharArray>>, start: Triple<Int, Int, Int>, end: Triple<Int, Int, Int>, l: Int, r: Int, c: Int): String {
        val directions = arrayOf(
            Triple(-1, 0, 0),
            Triple(1, 0, 0),
            Triple(0, -1, 0),
            Triple(0, 1, 0),
            Triple(0, 0, -1),
            Triple(0, 0, 1)
        )
        val queue = ArrayDeque<Triple<Int, Int, Int>>()
        val distances = Array(l) { Array(r) { IntArray(c) { -1 } } }

        queue.add(start)
        distances[start.first][start.second][start.third] = 0

        while (queue.isNotEmpty()) {
            val (z, y, x) = queue.removeFirst()

            if (Triple(z, y, x) == end) {
                return "Escaped in ${distances[z][y][x]} minute(s).\n"
            }

            for ((dz, dy, dx) in directions) {
                val nz = z + dz
                val ny = y + dy
                val nx = x + dx

                if (nz in 0 until l && ny in 0 until r && nx in 0 until c && building[nz][ny][nx] != '#' && distances[nz][ny][nx] == -1) {
                    distances[nz][ny][nx] = distances[z][y][x] + 1
                    queue.add(Triple(nz, ny, nx))
                }
            }
        }

        return "Trapped!\n"
    }
}
