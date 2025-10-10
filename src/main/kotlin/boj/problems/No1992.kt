package boj.problems

import java.io.BufferedReader

class No1992 {
    private lateinit var image: Array<CharArray>
    private val compressionResult = StringBuilder()

    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        image = Array(n) { input.readLine().toCharArray() }
        checkAndSplitImage(0, 0, n)
        return compressionResult.toString()
    }

    private fun checkAndSplitImage(
        x: Int,
        y: Int,
        size: Int
    ) {
        if (isAllSameBit(x, y, size)) {
            compressionResult.append(image[x][y])
            return
        }
        compressionResult.append("(")
        val newSize = size / 2
        checkAndSplitImage(x, y, newSize)
        checkAndSplitImage(x, y + newSize, newSize)
        checkAndSplitImage(x + newSize, y, newSize)
        checkAndSplitImage(x + newSize, y + newSize, newSize)
        compressionResult.append(")")
    }

    private fun isAllSameBit(
        x: Int,
        y: Int,
        size: Int
    ): Boolean {
        val bit = image[x][y]
        for (i in x until x + size) {
            for (j in y until y + size) {
                if (image[i][j] != bit) return false
            }
        }
        return true
    }
}
