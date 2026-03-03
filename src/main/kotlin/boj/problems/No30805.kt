package boj.problems

import java.io.BufferedReader

class No30805 {
    fun solve(input: BufferedReader): String {
        // 1. 입력 처리 및 배열 초기화
        val n = input.readLine().toInt()
        val a = input.readLine().split(" ").map { it.toInt() }.toIntArray()

        val m = input.readLine().toInt()
        val b = input.readLine().split(" ").map { it.toInt() }.toIntArray()

        // 2. 공통 부분 수열 탐색
        val result = mutableListOf<Int>()
        var idxA = 0
        var idxB = 0
        var targetValue = 100

        // targetValue가 0보다 크고, 두 배열 모두 탐색할 공간이 남아있을 때만 반복
        while (targetValue > 0 && idxA < n && idxB < m) {
            val posA = findIndex(a, idxA, targetValue)
            val posB = findIndex(b, idxB, targetValue)

            if (posA != -1 && posB != -1) {
                // 양쪽 배열 모두에서 targetValue를 찾은 경우
                result.add(targetValue)
                // 찾은 위치의 다음 인덱스부터 탐색하도록 갱신 (무한 루프 방지)
                idxA = posA + 1
                idxB = posB + 1
            } else {
                // 어느 한쪽이라도 targetValue가 없다면 값을 1 감소시켜 다음으로 큰 값을 탐색
                targetValue--
            }
        }

        // 3. 결과 출력 포맷팅
        return buildString {
            appendLine(result.size)
            if (result.isNotEmpty()) {
                append(result.joinToString(" "))
            }
        }.trimEnd()
    }

    /**
     * 배열의 startIndex부터 끝까지 순회하며 target을 찾고 그 인덱스를 반환합니다.
     * 존재하지 않을 경우 -1을 반환합니다.
     */
    private fun findIndex(
        arr: IntArray,
        startIndex: Int,
        target: Int
    ): Int {
        for (i in startIndex until arr.size) {
            if (arr[i] == target) {
                return i
            }
        }
        return -1
    }
}
