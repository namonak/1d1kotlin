package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No2615 {
    fun solve(input: BufferedReader): String {
        val board = parseBoard(input)

        for (r in 0 until BOARD_SIZE) {
            for (c in 0 until BOARD_SIZE) {
                val color = board[r][c]
                if (color == EMPTY) continue

                // 4방향에 대해 오목 여부 확인
                for (i in 0 until 4) {
                    if (checkWin(board, r, c, i, color)) {
                        // 결과 포맷: 승리한 색상 \n 가로줄 세로줄 (1-based index)
                        return "$color\n${r + 1} ${c + 1}"
                    }
                }
            }
        }

        return "0"
    }

    private fun parseBoard(input: BufferedReader): Array<IntArray> {
        return Array(BOARD_SIZE) {
            val st = StringTokenizer(input.readLine())
            IntArray(BOARD_SIZE) { st.nextToken().toInt() }
        }
    }

    /**
     * (r, c)를 시작점으로 하여 direction 방향으로 정확히 5개의 돌이 연속되는지 확인합니다.
     * 육목(6개 이상)인 경우와, 이미 이전에 세어진 경우(역방향 확인)를 걸러냅니다.
     */
    private fun checkWin(
        board: Array<IntArray>,
        r: Int,
        c: Int,
        direction: Int,
        color: Int
    ): Boolean {
        val dr = DR[direction]
        val dc = DC[direction]

        // 1. 역방향 확인 (Prev Check)
        // 현재 돌의 바로 이전 위치에 같은 색 돌이 있다면,
        // 현재 위치는 5목의 시작점이 아니므로(중간이거나 6목의 일부) false 반환
        val prevR = r - dr
        val prevC = c - dc
        if (isValidBounds(prevR, prevC) && board[prevR][prevC] == color) {
            return false
        }

        // 2. 연속된 5개 확인 (Forward Check)
        // 현재 돌(1개)을 포함하여 4개를 더 탐색
        for (k in 1 until TARGET_COUNT) {
            val nextR = r + dr * k
            val nextC = c + dc * k
            if (!isValidBounds(nextR, nextC) || board[nextR][nextC] != color) {
                return false
            }
        }

        // 3. 육목 확인 (Post Check)
        // 5개 연속된 돌의 바로 다음 위치에 같은 색 돌이 있다면 육목이므로 무효
        val nextR = r + dr * TARGET_COUNT
        val nextC = c + dc * TARGET_COUNT
        return !(isValidBounds(nextR, nextC) && board[nextR][nextC] == color)
    }

    private fun isValidBounds(
        r: Int,
        c: Int
    ): Boolean {
        return r in 0 until BOARD_SIZE && c in 0 until BOARD_SIZE
    }

    companion object {
        private const val BOARD_SIZE = 19
        private const val EMPTY = 0
        private const val TARGET_COUNT = 5

        // 탐색 방향: 우, 하, 우하향(↘), 우상향(↗)
        // 이 순서와 방향으로 탐색해야 시작점(r, c)가 항상 문제에서 요구하는 '가장 왼쪽' 좌표가 됩니다.
        private val DR = intArrayOf(0, 1, 1, -1)
        private val DC = intArrayOf(1, 0, 1, 1)
    }
}
