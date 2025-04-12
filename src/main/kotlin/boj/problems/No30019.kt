package boj.problems

import java.io.BufferedReader

class No30019 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val result = StringBuilder()

        // 각 강의실의 마지막 예약 종료 시각을 저장 (1-based index)
        val lastEndTimes = IntArray(n + 1)

        repeat(m) {
            val (room, start, end) = input.readLine().split(" ").map { it.toInt() }

            if (lastEndTimes[room] <= start) {
                result.append("YES\n")
                lastEndTimes[room] = end
            } else {
                result.append("NO\n")
            }
        }

        return result.toString().trimEnd()
    }
}
