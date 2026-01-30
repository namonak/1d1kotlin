package boj.problems

import java.io.BufferedReader

class No3107 {
    fun solve(input: BufferedReader): String {
        val line = input.readLine() ?: ""

        // 1. "::"를 기준으로 왼쪽과 오른쪽 섹션을 분리합니다.
        // limit = -1은 빈 문자열도 생략하지 않고 모두 유지하겠다는 의미입니다.
        val sections = line.split("::").map { it.split(":").filter(String::isNotEmpty) }

        val left = sections[0]
        val right = if (sections.size > 1) sections[1] else emptyList()

        // 2. 전체 8개에서 (왼쪽 개수 + 오른쪽 개수)를 뺀 만큼이 0000 그룹의 개수입니다.
        val middleCount = IPV6_GROUP_COUNT - (left.size + right.size)
        val middle = List(middleCount) { ZERO_BLOCK }

        // 3. 모든 그룹을 합치고 각 요소를 4자리로 맞춘 뒤 ":"로 잇습니다.
        return (left + middle + right)
            .joinToString(":") { it.padStart(GROUP_LENGTH, '0') }
    }

    companion object {
        private const val IPV6_GROUP_COUNT = 8
        private const val GROUP_LENGTH = 4
        private const val ZERO_BLOCK = "0000"
    }
}
