package boj.problems

import java.io.BufferedReader

class No31945 {
    fun solve(input: BufferedReader): String {
        val testCaseCount = input.readLine().toInt()
        val results = mutableListOf<String>()

        repeat(testCaseCount) {
            val (a, b, c, d) = input.readLine().split(" ").map { it.toInt() }
            results.add(if (isSameFace(a, b, c, d)) "YES" else "NO")
        }

        return results.joinToString("\n")
    }

    private fun isSameFace(a: Int, b: Int, c: Int, d: Int): Boolean {
        val point1 = CUBE_VERTICES[a]
        val point2 = CUBE_VERTICES[b]
        val point3 = CUBE_VERTICES[c]
        val point4 = CUBE_VERTICES[d]

        return isSameAxis(point1.first, point2.first, point3.first, point4.first) ||
            isSameAxis(point1.second, point2.second, point3.second, point4.second) ||
            isSameAxis(point1.third, point2.third, point3.third, point4.third)
    }

    private fun isSameAxis(coord1: Int, coord2: Int, coord3: Int, coord4: Int): Boolean {
        return coord1 == coord2 && coord2 == coord3 && coord3 == coord4
    }

    companion object {
        private val CUBE_VERTICES = arrayOf(
            Triple(0, 0, 0), // P0
            Triple(0, 0, 1), // P1
            Triple(0, 1, 0), // P2
            Triple(0, 1, 1), // P3
            Triple(1, 0, 0), // P4
            Triple(1, 0, 1), // P5
            Triple(1, 1, 0), // P6
            Triple(1, 1, 1) // P7
        )
    }
}
