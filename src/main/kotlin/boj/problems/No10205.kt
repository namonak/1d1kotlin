package boj.problems

import java.io.BufferedReader

class No10205 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().trim().toInt()
        val out = StringBuilder()

        repeat(t) { caseIdx ->
            var heads = input.readLine().trim().toInt()
            val actions = input.readLine().trim()

            for (ch in actions) {
                if (heads == 0) break // 문제 조건상 이후 행동은 주어지지 않지만 방어적으로 처리
                when (ch) {
                    'c' -> heads += 1 // 자르기만 하면 (-1 후 +2) => 순증가 +1
                    'b' -> heads -= 1 // 자르고 바로 지지면 재생 없음 => -1
                    else -> { /* 입력 도메인 밖 문자는 없음 */ }
                }
            }

            out.append("Data Set ${caseIdx + 1}:\n")
                .append(heads).append('\n')
            if (caseIdx != t - 1) out.append('\n') // 데이터셋 사이에 빈 줄
        }

        return out.toString()
    }
}
