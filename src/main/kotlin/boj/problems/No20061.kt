package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No20061 {
    fun solve(input: BufferedReader): String {
        val game = GameBoard()
        val n = input.readLine().toInt()

        repeat(n) {
            val st = StringTokenizer(input.readLine())
            val t = st.nextToken().toInt()
            val x = st.nextToken().toInt()
            val y = st.nextToken().toInt()

            game.playTurn(t, x, y)
        }

        return "${game.score}\n${game.countBlocks()}"
    }
}

private class GameBoard {
    var score = 0
        private set // 외부에서 점수 수정 방지

    private val green = Array(6) { IntArray(4) }
    private val blue = Array(4) { IntArray(6) }

    fun playTurn(
        t: Int,
        x: Int,
        y: Int
    ) {
        dropGreen(t, y)
        dropBlue(t, x)

        clearGreenLines()
        clearBlueLines()

        removeGreenLightRows()
        removeBlueLightCols()
    }

    private fun dropGreen(
        t: Int,
        y: Int
    ) {
        val row = findGreenLandingRow(t, y)

        when (t) {
            1 -> green[row][y] = 1
            2 -> {
                green[row][y] = 1
                green[row][y + 1] = 1
            }
            3 -> {
                green[row][y] = 1
                green[row + 1][y] = 1
            }
        }
    }

    private fun findGreenLandingRow(
        t: Int,
        y: Int
    ): Int {
        return when (t) {
            1 -> findLandingPosition(green.indices) { row -> green[row][y] == 1 }
            2 -> findLandingPosition(green.indices) { row -> green[row][y] == 1 || green[row][y + 1] == 1 }
            3 -> findLandingPosition(0 until green.lastIndex) { row -> green[row][y] == 1 || green[row + 1][y] == 1 }
            else -> 0
        }
    }

    private fun dropBlue(
        t: Int,
        x: Int,
    ) {
        val col = findBlueLandingCol(t, x)

        when (t) {
            1 -> blue[x][col] = 1
            2 -> {
                blue[x][col] = 1
                blue[x][col - 1] = 1
            }
            3 -> {
                blue[x][col] = 1
                blue[x + 1][col] = 1
            }
        }
    }

    private fun findBlueLandingCol(
        t: Int,
        x: Int
    ): Int {
        return when (t) {
            1, 2 -> findLandingPosition(blue[x].indices) { col -> blue[x][col] == 1 }
            3 -> findLandingPosition(blue[x].indices) { col -> blue[x][col] == 1 || blue[x + 1][col] == 1 }
            else -> 0
        }
    }

    private fun findLandingPosition(
        positions: IntRange,
        isBlocked: (Int) -> Boolean
    ): Int {
        return positions.firstOrNull(isBlocked)?.minus(1)?.coerceAtLeast(0) ?: positions.last
    }

    private fun clearGreenLines() {
        var r = 5
        while (r >= 2) {
            if (green[r].all { block -> block == 1 }) {
                score++
                removeGreenRow(r)
                r++ // 삭제 후 한 번 더 검사 (압축으로 인해 새로운 full row 생길 수 있음)
            }
            r--
        }
    }

    private fun clearBlueLines() {
        var c = 5
        while (c >= 2) {
            if (blue.all { row -> row[c] == 1 }) {
                score++
                removeBlueCol(c)
                c++ // 새로운 full column 발생 가능성 반영
            }
            c--
        }
    }

    private fun removeGreenLightRows() {
        val cnt = (0..1).count { row -> green[row].any { block -> block == 1 } }
        if (cnt == 0) return

        // 맨 아래 cnt개 행 삭제(4~5행)
        repeat(cnt) {
            removeGreenRow(green.lastIndex)
        }
    }

    private fun removeBlueLightCols() {
        val cnt = (0..1).count { col -> blue.any { row -> row[col] == 1 } }
        if (cnt == 0) return

        // 맨 오른쪽 열 cnt개 삭제 (4~5열)
        repeat(cnt) {
            removeBlueCol(blue[0].lastIndex)
        }
    }

    private fun removeGreenRow(targetRow: Int) {
        for (row in targetRow downTo 1) {
            green[row - 1].copyInto(green[row])
        }
        green[0].fill(0)
    }

    private fun removeBlueCol(targetCol: Int) {
        for (col in targetCol downTo 1) {
            blue.forEach { row -> row[col] = row[col - 1] }
        }
        blue.forEach { row -> row[0] = 0 }
    }

    fun countBlocks(): Int {
        return green.sumOf { row -> row.sum() } + blue.sumOf { row -> row.sum() }
    }
}
