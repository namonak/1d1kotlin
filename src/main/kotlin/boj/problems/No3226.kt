package boj.problems

import java.io.BufferedReader

private const val DAY_START = 7 * 60      // 07:00 → 분 단위
private const val DAY_END = 19 * 60       // 19:00 → 분 단위

class No3226 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var totalFee = 0

        repeat(n) {
            val (timeStr, durationStr) = input.readLine().split(" ")
            val duration = durationStr.toInt()
            val (h, m) = timeStr.split(":").map { it.toInt() }
            val startMinute = h * 60 + m

            // 통화 시작 시각부터 duration분 동안, 분 단위로 요금 계산
            for (offset in 0 until duration) {
                val current = (startMinute + offset) % (24 * 60)
                totalFee += if (current in DAY_START until DAY_END) 10 else 5
            }
        }

        return totalFee.toString()
    }
}
