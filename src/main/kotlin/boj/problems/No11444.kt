package boj.problems

import java.io.BufferedReader

class No11444 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toLong()

        if (n == 0L) return "0"
        if (n == 1L) return "1"

        // 기본 행렬: [[1, 1], [1, 0]]을 1차원 배열로 평탄화(Flatten)하여 표현
        val baseMatrix = longArrayOf(1L, 1L, 1L, 0L)

        // 거듭제곱 연산 수행
        val resultMatrix = power(baseMatrix, n)

        // A^n 행렬의 1행 2열(인덱스 1)이 F_n에 해당함
        return resultMatrix[1].toString()
    }

    /**
     * 행렬을 반복적으로 거듭제곱하여 시간 복잡도를 O(log N)으로 최적화하고
     * 콜스택 초과(StackOverflow) 위험을 제거한 반복문 기반 분할 정복 메서드입니다.
     */
    private fun power(
        matrix: LongArray,
        exp: Long
    ): LongArray {
        var result = longArrayOf(1L, 0L, 0L, 1L) // 단위 행렬 (Identity Matrix)
        var base = matrix
        var currentExp = exp

        while (currentExp > 0L) {
            // 지수가 홀수일 때 결과 행렬에 현재의 밑(base) 행렬을 곱함
            if (currentExp % 2L == 1L) {
                result = multiply(result, base)
            }
            // 밑 행렬을 제곱하고 지수를 반으로 줄임
            base = multiply(base, base)
            currentExp /= 2L
        }

        return result
    }

    /**
     * 두 2x2 행렬(1차원 배열로 표현)을 곱하고 모듈로 연산을 적용합니다.
     */
    private fun multiply(
        m1: LongArray,
        m2: LongArray
    ): LongArray {
        return longArrayOf(
            (m1[0] * m2[0] + m1[1] * m2[2]) % MOD, // 1행 1열
            (m1[0] * m2[1] + m1[1] * m2[3]) % MOD, // 1행 2열
            (m1[2] * m2[0] + m1[3] * m2[2]) % MOD, // 2행 1열
            (m1[2] * m2[1] + m1[3] * m2[3]) % MOD // 2행 2열
        )
    }

    companion object {
        private const val MOD = 1_000_000_007L
    }
}
