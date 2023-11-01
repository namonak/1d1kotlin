package boj.problems

import java.io.BufferedReader

object No2309 {
    fun solve(input: BufferedReader): String {
        val heights = mutableListOf<Int>()
        repeat(9) {
            heights.add(input.readLine().toInt())
        }
        val sum = heights.sum()
        heights.sort()
        loop@ for (i in 0 until heights.size - 1) {
            for (j in i + 1 until heights.size) {
                if (sum - heights[i] - heights[j] == 100) {
                    heights.removeAt(j)
                    heights.removeAt(i)
                    break@loop
                }
            }
        }
        return heights.joinToString("\n").trimEnd()
    }
}
