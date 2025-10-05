package boj.problems

import java.io.BufferedReader

class No24264 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toLong()
        val operationCount = n * n // 코드1의 수행 횟수 (n²)
        val degree = 2 // 다항식 최고차항의 차수

        return "$operationCount\n$degree"
    }
}
