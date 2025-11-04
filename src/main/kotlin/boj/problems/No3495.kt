package boj.problems

import java.io.BufferedReader

class No3495 {
    fun solve(input: BufferedReader): String {
        val (h, w) = input.readLine().split(" ").map { it.toInt() }

        var area = 0.0

        repeat(h) {
            val line = input.readLine()
            area += computeLineArea(line, w)
        }

        return area.toInt().toString()
    }

    private fun computeLineArea(
        line: String,
        width: Int
    ): Double {
        var inside = false
        var lineArea = 0.0

        for (i in 0 until width) {
            when (line[i]) {
                '/', '\\' -> {
                    // 경계선은 0.5
                    lineArea += 0.5
                    // 경계선을 지날 때마다 안/밖 토글
                    inside = !inside
                }
                '.' -> {
                    if (inside) {
                        // 현재는 도형 안쪽
                        lineArea += 1.0
                    }
                }
                else -> {
                }
            }
        }

        return lineArea
    }
}
