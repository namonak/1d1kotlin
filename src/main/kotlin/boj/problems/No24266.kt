package boj.problems

import java.io.BufferedReader

class No24266 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toLong()
        val operationCount = n * n * n // 코드1 수행 횟수: n^3
        val degree = 3 // 최고차항의 차수
        return "$operationCount\n$degree"
    }
}
