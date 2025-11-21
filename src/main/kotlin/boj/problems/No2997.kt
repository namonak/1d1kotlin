package boj.problems

import java.io.BufferedReader

class No2997 {
    fun solve(input: BufferedReader): String {
        val nums = input.readLine()
            .trim()
            .split(" ")
            .map { it.toInt() }
            .sorted()

        val (a, b, c) = nums
        val diff1 = b - a
        val diff2 = c - b
        val diff = minOf(diff1, diff2)

        return if (diff1 == diff && diff2 == diff) {
            // 이미 등차수열 → 다음 항 출력
            (c + diff).toString()
        } else if (diff1 == diff) {
            // a, b는 맞고 c만 멀리 떨어진 경우 → 중간값 출력
            (b + diff).toString()
        } else {
            // b, c는 맞고 a만 멀리 떨어진 경우 → 중간값 출력
            (a + diff).toString()
        }
    }
}
