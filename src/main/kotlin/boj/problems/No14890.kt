package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No14890 {
    fun solve(input: BufferedReader): String {
        var st = StringTokenizer(input.readLine())
        val n = st.nextToken().toInt()
        val l = st.nextToken().toInt()

        val map = Array(n) {
            st = StringTokenizer(input.readLine())
            IntArray(n) { st.nextToken().toInt() }
        }

        val answer = calculateBuildablePaths(n, l, map)
        return answer.toString()
    }

    /**
     * 가로 및 세로 방향의 모든 길을 검사하여 지나갈 수 있는 길의 총 개수를 반환합니다.
     */
    private fun calculateBuildablePaths(
        size: Int,
        rampLength: Int,
        map: Array<IntArray>
    ): Int {
        var buildableCount = 0

        // 1) 행(Row) 검사
        for (row in map) {
            if (canCross(row, size, rampLength)) buildableCount++
        }

        // 2) 열(Column) 검사
        for (colIndex in 0 until size) {
            val column = IntArray(size) { rowIndex -> map[rowIndex][colIndex] }
            if (canCross(column, size, rampLength)) buildableCount++
        }

        return buildableCount
    }

    /**
     * 주어진 1차원 배열(하나의 길)에 대해 경사로를 설치하여 지나갈 수 있는지 검증합니다.
     */
    private fun canCross(
        path: IntArray,
        size: Int,
        rampLength: Int
    ): Boolean {
        val hasRamp = BooleanArray(size)

        for (i in 0 until size - 1) {
            val currentHeight = path[i]
            val nextHeight = path[i + 1]
            val heightDiff = nextHeight - currentHeight

            when (heightDiff) {
                0 -> continue // 높이가 같음
                1 -> { // 오르막 (다음 칸이 1 더 높음, 뒤로 탐색)
                    if (!canBuildRamp(path, hasRamp, i, -1, size, rampLength)) return false
                }
                -1 -> { // 내리막 (다음 칸이 1 더 낮음, 앞으로 탐색)
                    if (!canBuildRamp(path, hasRamp, i + 1, 1, size, rampLength)) return false
                }
                else -> return false // 높이 차이가 2 이상이므로 절대 불가
            }
        }
        return true
    }

    /**
     * 특정 시작점부터 지정된 방향으로 경사로 설치가 가능한지 확인하고, 가능하면 설치 처리(true)를 합니다.
     */
    private fun canBuildRamp(
        path: IntArray,
        hasRamp: BooleanArray,
        startIndex: Int,
        direction: Int,
        size: Int,
        rampLength: Int
    ): Boolean {
        val baseHeight = path[startIndex]

        for (step in 0 until rampLength) {
            val checkIndex = startIndex + (step * direction)

            // 1. 맵의 범위를 벗어나는지 확인
            if (checkIndex !in 0 until size) return false
            // 2. 높이가 평탄하지 않거나, 이미 경사로가 설치되어 있는지 확인
            if (path[checkIndex] != baseHeight || hasRamp[checkIndex]) return false

            hasRamp[checkIndex] = true // 경사로 설치
        }
        return true
    }
}
