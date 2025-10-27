package boj.problems

import java.io.BufferedReader

class No2346 {
    private data class Balloon(val index: Int, val paper: Int)

    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val papers = input.readLine().split(" ").map { it.toInt() }
        val balloons = ArrayList(
            (0 until n).map {
                Balloon(it + 1, papers[it])
            }
        )

        val result = mutableListOf<Int>()
        var index = 0

        while (true) {
            result.add(balloons[index].index)
            val paper = balloons[index].paper
            balloons.removeAt(index)
            if (balloons.isEmpty()) break
            if (paper > 0) {
                index = (index + paper - 1) % balloons.size
            } else {
                index = (index + paper) % balloons.size
                if (index < 0) index += balloons.size
            }
        }

        return result.joinToString(" ")
    }
}
