package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No1890 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val board = Array(n) { IntArray(n) }
        val dp = Array(n) { LongArray(n) }

        // 1. 게임판 정보 파싱 및 저장
        for (i in 0 until n) {
            val tokenizer = StringTokenizer(input.readLine())
            for (j in 0 until n) {
                board[i][j] = tokenizer.nextToken().toInt()
            }
        }

        // 2. 동적 계획법(DP) 초기 상태 설정
        dp[0][0] = 1L

        // 3. DP를 활용한 경로 탐색 (Tabulation)
        for (row in 0 until n) {
            for (col in 0 until n) {
                // 도달할 수 없는 칸이거나, 이미 목적지에 도달한 경우 탐색을 진행하지 않음
                if (dp[row][col] == 0L || (row == n - 1 && col == n - 1)) {
                    continue
                }

                val jumpDistance = board[row][col]

                // 아래쪽으로 점프하는 경우
                val nextRow = row + jumpDistance
                if (nextRow < n) {
                    dp[nextRow][col] += dp[row][col]
                }

                // 오른쪽으로 점프하는 경우
                val nextCol = col + jumpDistance
                if (nextCol < n) {
                    dp[row][nextCol] += dp[row][col]
                }
            }
        }

        // 4. 목적지에 누적된 최종 경로의 수 반환
        return dp[n - 1][n - 1].toString()
    }
}
