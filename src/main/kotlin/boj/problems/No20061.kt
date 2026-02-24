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
        var r = 0
        when (t) {
            1 -> {
                for (row in 0 until 6) {
                    if (green[row][y] == 1) break
                    r = row
                }
                green[r][y] = 1
            }
            2 -> {
                for (row in 0 until 6) {
                    if (green[row][y] == 1 || green[row][y + 1] == 1) break
                    r = row
                }
                green[r][y] = 1
                green[r][y + 1] = 1
            }
            3 -> {
                for (row in 0 until 5) {
                    if (green[row][y] == 1 || green[row + 1][y] == 1) break
                    r = row
                }
                green[r][y] = 1
                green[r + 1][y] = 1
            }
        }
    }

    private fun dropBlue(
        t: Int,
        x: Int,
    ) {
        var c = 0
        when (t) {
            1 -> {
                for (col in 0 until 6) {
                    if (blue[x][col] == 1) break
                    c = col
                }
                blue[x][c] = 1
            }
            2 -> {
                for (col in 0 until 6) {
                    if (blue[x][col] == 1) break
                    c = col
                }
                blue[x][c] = 1
                blue[x][c - 1] = 1
            }
            3 -> {
                for (col in 0 until 6) {
                    if (blue[x][col] == 1 || blue[x + 1][col] == 1) break
                    c = col
                }
                blue[x][c] = 1
                blue[x + 1][c] = 1
            }
        }
    }

    private fun clearGreenLines() {
        var r = 5
        while (r >= 2) {
            var full = true
            for (c in 0..3) {
                if (green[r][c] == 0) {
                    full = false
                    break
                }
            }
            if (full) {
                score++
                // 행 삭제
                for (row in r downTo 1) {
                    for (col in 0..3) {
                        green[row][col] = green[row - 1][col]
                    }
                }
                // 최상단 비우기
                for (col in 0..3) green[0][col] = 0

                r++ // 삭제 후 한 번 더 검사 (압축으로 인해 새로운 full row 생길 수 있음)
            }
            r--
        }
    }

    private fun clearBlueLines() {
        var c = 5
        while (c >= 2) {
            var full = true
            for (r in 0..3) {
                if (blue[r][c] == 0) {
                    full = false
                    break
                }
            }
            if (full) {
                score++
                // 열 삭제 + 오른쪽으로 밀기
                for (col in c downTo 1) {
                    for (row in 0..3) {
                        blue[row][col] = blue[row][col - 1]
                    }
                }
                // 최좌측 비움
                for (row in 0..3) blue[row][0] = 0

                c++ // 새로운 full column 발생 가능성 반영
            }
            c--
        }
    }

    private fun removeGreenLightRows() {
        var cnt = 0
        for (r in 0..1) {
            for (c in 0..3) {
                if (green[r][c] == 1) {
                    cnt++
                    break
                }
            }
        }
        if (cnt == 0) return

        // 맨 아래 cnt개 행 삭제(4~5행)
        repeat(cnt) {
            for (r in 5 downTo 1) {
                for (c in 0..3) {
                    green[r][c] = green[r - 1][c]
                }
            }
            for (c in 0..3) green[0][c] = 0
        }
    }

    private fun removeBlueLightCols() {
        var cnt = 0
        for (c in 0..1) {
            for (r in 0..3) {
                if (blue[r][c] == 1) {
                    cnt++
                    break
                }
            }
        }
        if (cnt == 0) return

        // 맨 오른쪽 열 cnt개 삭제 (4~5열)
        repeat(cnt) {
            for (col in 5 downTo 1) {
                for (row in 0..3) {
                    blue[row][col] = blue[row][col - 1]
                }
            }
            for (row in 0..3) blue[row][0] = 0
        }
    }

    fun countBlocks(): Int {
        return green.sumOf { row -> row.sum() } + blue.sumOf { row -> row.sum() }
    }
}
