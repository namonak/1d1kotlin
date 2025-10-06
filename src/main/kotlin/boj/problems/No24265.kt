package boj.problems

import java.io.BufferedReader

class No24265 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toLong()
        val operationCount = n * (n - 1) / 2 // 코드1 수행 횟수 (O(n^2) 계수 1/2)
        val degree = 2 // 다항식 최고차항의 차수
        return "$operationCount\n$degree"
    }
}
