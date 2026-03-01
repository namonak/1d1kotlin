package boj.problems

import java.io.BufferedReader

class No2448 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val width = 2 * n - 1
        val map = Array(n) { CharArray(width) { ' ' } }

        fun drawStar(
            r: Int,
            c: Int,
            size: Int
        ) {
            if (size == 3) {
                map[r][c] = '*'
                map[r + 1][c - 1] = '*'
                map[r + 1][c + 1] = '*'
                map[r + 2][c - 2] = '*'
                map[r + 2][c - 1] = '*'
                map[r + 2][c] = '*'
                map[r + 2][c + 1] = '*'
                map[r + 2][c + 2] = '*'
                return
            }

            // Divide: 크기를 절반으로 줄이고 3개의 하위 삼각형으로 분할합니다.
            val nextSize = size / 2
            drawStar(r, c, nextSize) // 상단 삼각형
            drawStar(r + nextSize, c - nextSize, nextSize) // 하단 좌측 삼각형
            drawStar(r + nextSize, c + nextSize, nextSize) // 하단 우측 삼각형
        }

        drawStar(0, n - 1, n)

        val capacity = n * (width + 1)
        val sb = StringBuilder(capacity)

        for (i in 0 until n) {
            sb.append(map[i])
            sb.append('\n')
        }

        return sb.toString().trimEnd()
    }
}
