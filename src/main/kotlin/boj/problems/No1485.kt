package boj.problems

import java.io.BufferedReader

class No1485 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) {
            val points = Array(4) { input.readLine().split(" ").map { it.toInt() } }
            val distances = mutableListOf<Int>()

            for (i in 0 until 4) {
                for (j in i + 1 until 4) {
                    distances.add(
                        (points[i][0] - points[j][0]) * (points[i][0] - points[j][0]) +
                            (points[i][1] - points[j][1]) * (points[i][1] - points[j][1])
                    )
                }
            }
            distances.sort()

            result.append(
                if (distances[0] == distances[1] &&
                    distances[1] == distances[2] &&
                    distances[2] == distances[3] &&
                    distances[4] == distances[5]
                ) {
                    "1\n"
                } else {
                    "0\n"
                }
            )
        }

        return result.toString().trimEnd()
    }
}
