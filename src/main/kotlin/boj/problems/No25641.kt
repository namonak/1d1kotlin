package boj.problems

import java.io.BufferedReader

class No25641 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val line = input.readLine()

        var sCount = 0
        var tCount = 0

        // 전체 개수 먼저 카운트
        for (ch in line) {
            if (ch == 's') {
                sCount++
            } else {
                tCount++
            }
        }

        // 앞에서부터 제거해 가며 균형 확인
        for (i in line.indices) {
            if (sCount == tCount) {
                return line.substring(i)
            }

            // 앞에서 제거: counts 업데이트
            if (line[i] == 's') sCount-- else tCount--
        }

        // 마지막까지 안 맞으면 마지막 문자부터가 균형 (문제 조건상 사실 여기까지 오지 않음)
        return ""
    }
}
