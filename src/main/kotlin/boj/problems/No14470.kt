package boj.problems

import java.io.BufferedReader

class No14470 {
    fun solve(input: BufferedReader): String {
        val a = input.readLine().trim().toInt() // 현재 온도
        val b = input.readLine().trim().toInt() // 목표 온도
        val c = input.readLine().trim().toInt() // 얼어 있는 고기를 1℃ 데우는 시간
        val d = input.readLine().trim().toInt() // 0℃에서 해동 시간
        val e = input.readLine().trim().toInt() // 얼어 있지 않은 고기를 1℃ 데우는 시간

        val time = if (a < 0) {
            (-a) * c + d + b * e
        } else {
            (b - a) * e
        }

        return time.toString()
    }
}
