package boj.problems

import java.io.BufferedReader

class No27918 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().trim().toInt()

        var d = 0 // 달구 점수
        var p = 0 // 포닉스 점수

        repeat(n) {
            val win = input.readLine().trim() // "D" 또는 "P"
            if (win == "D") d++ else p++

            // 2점 차가 나는 순간 경기 종료
            if (kotlin.math.abs(d - p) == 2) {
                return "$d:$p"
            }
        }

        // N라운드 모두 진행한 경우
        return "$d:$p"
    }
}
