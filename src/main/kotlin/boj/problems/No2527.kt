package boj.problems

import java.io.BufferedReader

class No2527 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        repeat(4) {
            val nums = input.readLine().split(" ").map { it.toInt() }
            val x1 = nums[0]
            val y1 = nums[1]
            val p1 = nums[2]
            val q1 = nums[3]
            val x2 = nums[4]
            val y2 = nums[5]
            val p2 = nums[6]
            val q2 = nums[7]

            // x축 교집합 길이
            val dx = minOf(p1, p2) - maxOf(x1, x2)
            // y축 교집합 길이
            val dy = minOf(q1, q2) - maxOf(y1, y2)

            // 분류: 겹침 없음(d) → 점(c) → 선분(b) → 직사각형(a)
            val code = when {
                dx < 0 || dy < 0 -> 'd'
                dx == 0 && dy == 0 -> 'c'
                dx == 0 || dy == 0 -> 'b'
                else -> 'a'
            }

            sb.append(code).append('\n')
        }
        return sb.toString().trimEnd()
    }
}
