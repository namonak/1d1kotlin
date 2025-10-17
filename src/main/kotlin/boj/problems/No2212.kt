package boj.problems

import java.io.BufferedReader

class No2212 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val k = input.readLine().toInt()
        val sensors = input.readLine().split(" ").map { it.toInt() }.sorted()

        val distances = mutableListOf<Int>()
        for (i in 1 until sensors.size) {
            distances.add(sensors[i] - sensors[i - 1])
        }

        distances.sort()

        var answer = 0
        for (i in 0 until distances.size - (k - 1)) {
            answer += distances[i]
        }

        return answer.toString()
    }
}
