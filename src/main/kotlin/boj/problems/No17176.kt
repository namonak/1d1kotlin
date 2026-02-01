package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No17176 {
    fun solve(input: BufferedReader): String {
        // 1. 입력값 읽기
        val n = input.readLine()?.toIntOrNull() ?: return "n"

        // 빈도수를 저장할 배열 (0~52 범위를 커버하기 위해 크기 53)
        val frequencyMap = IntArray(53)

        // 2. 암호문 수열 처리 (StringTokenizer를 사용하여 대량의 입력 효율적으로 처리)
        val st = StringTokenizer(input.readLine())
        repeat(n) {
            if (st.hasMoreTokens()) {
                val code = st.nextToken().toInt()
                frequencyMap[code]++
            }
        }

        // 3. 평문 처리
        val plainText = input.readLine() ?: ""

        // 문제 조건: 평문의 길이는 N과 같음
        if (plainText.length != n) return "n"

        for (char in plainText) {
            val convertedValue = char.toCipherInt()

            // 암호문에 해당 문자가 부족한 경우 바로 실패 처리
            if (frequencyMap[convertedValue] <= 0) {
                return "n"
            }
            frequencyMap[convertedValue]--
        }

        return "y"
    }

    /**
     * 문자를 문제 조건에 맞는 정수로 변환하는 확장 함수
     */
    private fun Char.toCipherInt(): Int {
        return when (this) {
            ' ' -> 0
            in 'A'..'Z' -> this - 'A' + 1
            in 'a'..'z' -> this - 'a' + 27
            else -> throw IllegalArgumentException("유효하지 않은 문자입니다.")
        }
    }
}
