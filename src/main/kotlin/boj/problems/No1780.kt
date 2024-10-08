package boj.problems

import java.io.BufferedReader

class No1780 {
    private lateinit var paper: Array<IntArray>
    private var minusOneCount = 0
    private var zeroCount = 0
    private var oneCount = 0

    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        paper = Array(n) { input.readLine().split(" ").map { it.toInt() }.toIntArray() }

        checkAndSplitPaper(0, 0, n)
        return "$minusOneCount\n$zeroCount\n$oneCount"
    }

    private fun checkAndSplitPaper(x: Int, y: Int, size: Int) {
        if (isAllSameColor(x, y, size)) {
            when (paper[x][y]) {
                -1 -> minusOneCount++
                0 -> zeroCount++
                1 -> oneCount++
            }
            return
        }
        val newSize = size / 3
        checkAndSplitPaper(x, y, newSize)
        checkAndSplitPaper(x, y + newSize, newSize)
        checkAndSplitPaper(x, y + newSize * 2, newSize)
        checkAndSplitPaper(x + newSize, y, newSize)
        checkAndSplitPaper(x + newSize, y + newSize, newSize)
        checkAndSplitPaper(x + newSize, y + newSize * 2, newSize)
        checkAndSplitPaper(x + newSize * 2, y, newSize)
        checkAndSplitPaper(x + newSize * 2, y + newSize, newSize)
        checkAndSplitPaper(x + newSize * 2, y + newSize * 2, newSize)
    }

    private fun isAllSameColor(x: Int, y: Int, size: Int): Boolean {
        val color = paper[x][y]
        for (i in x until x + size) {
            for (j in y until y + size) {
                if (paper[i][j] != color) return false
            }
        }
        return true
    }
}
