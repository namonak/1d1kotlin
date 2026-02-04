package boj.problems

import java.io.BufferedReader

class No17091 {
    // 1부터 30까지의 숫자를 영어 단어로 매핑
    private val numberToWord = mapOf(
        1 to "one",
        2 to "two",
        3 to "three",
        4 to "four",
        5 to "five",
        6 to "six",
        7 to "seven",
        8 to "eight",
        9 to "nine",
        10 to "ten",
        11 to "eleven",
        12 to "twelve",
        13 to "thirteen",
        14 to "fourteen",
        15 to "quarter",
        16 to "sixteen",
        17 to "seventeen",
        18 to "eighteen",
        19 to "nineteen",
        20 to "twenty",
        21 to "twenty one",
        22 to "twenty two",
        23 to "twenty three",
        24 to "twenty four",
        25 to "twenty five",
        26 to "twenty six",
        27 to "twenty seven",
        28 to "twenty eight",
        29 to "twenty nine",
        30 to "half"
    )

    fun solve(input: BufferedReader): String {
        val h = input.readLine().toInt()
        val m = input.readLine().toInt()

        val hourWord = numberToWord[h] ?: ""

        return when {
            m == 0 -> "$hourWord o' clock"
            m <= 30 -> "${getMinuteExpression(m)} past $hourWord"
            else -> {
                // 30분을 넘어가면 'to'를 사용하며 다음 시(Next Hour)를 가리킴
                val remainingMinutes = 60 - m
                val nextHour = if (h == 12) 1 else h + 1
                val nextHourWord = numberToWord[nextHour]

                "${getMinuteExpression(remainingMinutes)} to $nextHourWord"
            }
        }
    }

    // 분(minute)에 따라 올바른 영어 표현을 반환하는 헬퍼 함수
    private fun getMinuteExpression(minutes: Int): String {
        val word = numberToWord[minutes] ?: ""
        return when (minutes) {
            1 -> "$word minute" // 1분은 단수 (minute)
            15, 30 -> word // quarter, half는 뒤에 minutes를 붙이지 않음
            else -> "$word minutes" // 그 외는 복수 (minutes)
        }
    }
}
