package boj.problems

import java.io.BufferedReader

class No2447 {
    private lateinit var stars: Array<CharArray>

    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()

        stars = Array(n) { CharArray(n) { ' ' } }

        drawStars(0, 0, n)

        return stars.joinToString("\n") { it.joinToString("") }
    }

    private fun drawStars(
        x: Int,
        y: Int,
        size: Int
    ) {
        if (size == 1) {
            stars[x][y] = '*'
            return
        }

        val newSize = size / 3
        drawStars(x, y, newSize)
        drawStars(x, y + newSize, newSize)
        drawStars(x, y + newSize * 2, newSize)
        drawStars(x + newSize, y, newSize)
        drawStars(x + newSize, y + newSize * 2, newSize)
        drawStars(x + newSize * 2, y, newSize)
        drawStars(x + newSize * 2, y + newSize, newSize)
        drawStars(x + newSize * 2, y + newSize * 2, newSize)
    }
}
