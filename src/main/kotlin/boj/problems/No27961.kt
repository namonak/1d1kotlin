package boj.problems

import java.io.BufferedReader

class No27961 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toLong()
        if (n == 0L) return "0"

        // 현재 고양이 수의 이진 비트 길이 (L)
        val highestBit = 64 - java.lang.Long.numberOfLeadingZeros(n)
        // 이진 표현에서 1의 개수
        val onesCount = java.lang.Long.bitCount(n)

        // N이 2의 거듭제곱인지 확인하여 최적 행동 횟수 계산
        //  - 2의 거듭제곱인 경우: L번 (첫 생성 후 L-1회 전부 복제)
        //  - 아닌 경우: L+1번 (마지막 단계에서 한 번에 잔여 복제)
        val actions = highestBit + if (onesCount == 1) 0 else 1
        return actions.toString()
    }
}
