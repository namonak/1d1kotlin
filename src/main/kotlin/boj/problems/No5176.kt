package boj.problems

import java.io.BufferedReader

class No5176 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().trim().toInt()
        val out = StringBuilder()

        repeat(t) {
            val (participants, seats) = input.readLine().trim().split(" ").map { it.toInt() }

            // 좌석 점유 여부 (1..seats 사용)
            val occupied = BooleanArray(seats + 1)
            var rejected = 0

            repeat(participants) {
                val want = input.readLine().trim().toInt()
                if (want in 1..seats && !occupied[want]) {
                    occupied[want] = true
                } else {
                    // 범위를 벗어나도 앉지 못하므로 거절 처리
                    rejected++
                }
            }

            out.appendLine(rejected)
        }
        return out.toString().trimEnd()
    }
}
