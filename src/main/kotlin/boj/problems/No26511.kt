package boj.problems

import java.io.BufferedReader

class No26511 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine()?.toIntOrNull() ?: return ""
        val result = StringBuilder()

        repeat(n) {
            val s = input.readLine() ?: ""
            result.append(calculateMinErasures(s)).append("\n")
        }

        return result.toString().trimEnd()
    }

    /**
     * 특정 문자열에서 복잡도를 2 이하로 유지하기 위해 지워야 할 문자의 개수를 계산합니다.
     */
    private fun calculateMinErasures(s: String): Int {
        if (s.length <= 2) return 0

        // 1. 각 문자의 빈도수를 구함 (예: "letter" -> {l=1, e=2, t=2, r=1})
        val frequencyMap = s.groupingBy { it }.eachCount()

        // 2. 빈도수만 추출하여 내림차순 정렬
        val sortedFrequencies = frequencyMap.values.sortedDescending()

        // 3. 복잡도가 이미 2 이하인 경우
        if (sortedFrequencies.size <= 2) return 0

        // 4. 가장 빈도가 높은 2개의 문자를 제외한 나머지의 합을 구함
        // 전체 길이 - (가장 많이 나온 문자 1위 빈도 + 2위 빈도)
        val topTwoSum = sortedFrequencies.take(2).sum()

        return s.length - topTwoSum
    }
}
