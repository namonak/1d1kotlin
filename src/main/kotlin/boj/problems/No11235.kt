package boj.problems

import java.io.BufferedReader

class No11235 {
    fun solve(input: BufferedReader): String {
        // 1. 투표 수 N 읽기 (입력이 비어있으면 빈 문자열 반환)
        val n = input.readLine()?.toIntOrNull() ?: return ""

        // 2. N개의 투표 기록을 리스트로 수집
        val votes = List(n) { input.readLine() ?: "" }

        // 3. 투표 결과 집계 및 승자 추출 로직
        val candidateCounts = votes.groupingBy { it }.eachCount()

        // 최대 득표수 확인
        val maxVotes = candidateCounts.values.maxOrNull() ?: 0

        // 최대 득표자와 동일한 표를 얻은 후보들 필터링 -> 사전순 정렬 -> 문자열 병합
        return candidateCounts
            .filterValues { it == maxVotes }
            .keys
            .sorted()
            .joinToString("\n")
    }
}
