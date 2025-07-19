package boj.problems

import java.io.BufferedReader

class No18005 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toLong()
        return when {
            // n이 홀수이면 합이 짝수·홀수 모두 가능
            n % 2 == 1L -> "0"
            // n이 4의 배수이면 합이 항상 짝수
            n % 4 == 0L -> "2"
            // 그 외(짝수이면서 4의 배수가 아닐 때)는 합이 항상 홀수
            else -> "1"
        }
    }
}
