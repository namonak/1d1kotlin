package boj.problems

import java.io.BufferedReader

class No2630 {
    private var whiteCount = 0
    private var blueCount = 0
    private lateinit var paper: Array<IntArray>

    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        paper = Array(n) { input.readLine().split(" ").map { it.toInt() }.toIntArray() }
        checkAndSplitPaper(0, 0, n)
        return "$whiteCount\n$blueCount"
    }

    private fun checkAndSplitPaper(
        x: Int,
        y: Int,
        size: Int
    ) {
        if (isAllSameColor(x, y, size)) {
            if (paper[x][y] == 0) {
                whiteCount++
            } else {
                blueCount++
            }
            return
        }
        val newSize = size / 2
        checkAndSplitPaper(x, y, newSize)
        checkAndSplitPaper(x, y + newSize, newSize)
        checkAndSplitPaper(x + newSize, y, newSize)
        checkAndSplitPaper(x + newSize, y + newSize, newSize)
    }

    private fun isAllSameColor(
        x: Int,
        y: Int,
        size: Int
    ): Boolean {
        val color = paper[x][y]
        for (i in x until x + size) {
            for (j in y until y + size) {
                if (paper[i][j] != color) return false
            }
        }
        return true
    }
}
