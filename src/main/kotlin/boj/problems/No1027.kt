package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer
import kotlin.math.max

class No1027 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        if (n == 0) return "0"

        val heights = LongArray(n)
        val st = StringTokenizer(input.readLine())
        for (i in 0 until n) {
            heights[i] = st.nextToken().toLong()
        }

        var maxVisible = 0

        for (i in 0 until n) {
            maxVisible = max(maxVisible, countVisibleBuildings(i, n, heights))
        }

        return maxVisible.toString()
    }

    private fun countVisibleBuildings(
        current: Int,
        n: Int,
        heights: LongArray
    ): Int {
        var count = 0

        // 왼쪽 방향 검사
        var minSlope = Double.MAX_VALUE
        for (left in current - 1 downTo 0) {
            val slope = calculateSlope(current, heights[current], left, heights[left])
            // 왼쪽으로 갈수록 기울기가 더 작아져야 시야가 확보됨
            if (left == current - 1 || slope < minSlope) {
                minSlope = slope
                count++
            }
        }

        // 오른쪽 방향 검사
        var maxSlope = -Double.MAX_VALUE
        for (right in current + 1 until n) {
            val slope = calculateSlope(current, heights[current], right, heights[right])
            // 오른쪽으로 갈수록 기울기가 더 커져야 시야가 확보됨
            if (right == current + 1 || slope > maxSlope) {
                maxSlope = slope
                count++
            }
        }

        return count
    }

    private fun calculateSlope(
        x1: Int,
        y1: Long,
        x2: Int,
        y2: Long
    ): Double {
        return (y2 - y1).toDouble() / (x2 - x1).toDouble()
    }
}
