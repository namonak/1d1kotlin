package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No11582 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val scores = IntArray(n)
        val st = StringTokenizer(input.readLine())

        for (i in 0 until n) {
            scores[i] = st.nextToken().toInt()
        }

        val k = input.readLine().toInt()

        // 한 사람이 정렬해야 하는 타겟 구간 크기 계산
        val targetSize = n / k

        // 분할 정복 시작
        divideAndSort(scores, 0, n - 1, targetSize)

        // 결과 조립 (StringBuilder가 joinToString보다 대량 데이터에 유리할 수 있음)
        return scores.joinToString(" ").trimEnd()
    }

    private fun divideAndSort(
        scores: IntArray,
        left: Int,
        right: Int,
        targetSize: Int
    ) {
        val currentSize = right - left + 1

        if (currentSize > targetSize) {
            val mid = (left + right) / 2
            divideAndSort(scores, left, mid, targetSize)
            divideAndSort(scores, mid + 1, right, targetSize)
        } else {
            scores.sort(left, right + 1)
        }
    }
}
