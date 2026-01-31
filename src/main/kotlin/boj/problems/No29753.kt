package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No29753 {
    // 성적과 평점 매핑 (오차 방지를 위해 100을 곱한 정수 사용)
    private val gradeMap = linkedMapOf(
        "F" to 0,
        "D0" to 100,
        "D+" to 150,
        "C0" to 200,
        "C+" to 250,
        "B0" to 300,
        "B+" to 350,
        "A0" to 400,
        "A+" to 450
    )

    fun solve(input: BufferedReader): String {
        val firstLine = StringTokenizer(input.readLine())
        val n = firstLine.nextToken().toInt()
        val targetAverage = (firstLine.nextToken().replace(".", "").toInt())

        var totalCredits = 0
        var totalPointsSum = 0

        // 이미 성적이 나온 N-1개 과목 처리
        repeat(n - 1) {
            val st = StringTokenizer(input.readLine())
            val credit = st.nextToken().toInt()
            val grade = st.nextToken()

            totalCredits += credit
            totalPointsSum += credit * (gradeMap[grade] ?: 0)
        }

        // 성적을 받아야 하는 마지막 과목의 학점
        val lastCredit = input.readLine().toInt()
        totalCredits += lastCredit

        // 낮은 성적부터 순회하며 기준을 초과하는지 확인
        for ((gradeName, gradeValue) in gradeMap) {
            val currentTotalPoints = totalPointsSum + (lastCredit * gradeValue)

            // 평균 계산 (소수점 셋째 자리 버림 -> 정수 나눗셈으로 구현)
            // (총합 * 100 / 총학점)을 하면 소수점 두 자리 정수값이 나옴
            val currentAverage = currentTotalPoints / totalCredits

            if (currentAverage > targetAverage) {
                return gradeName
            }
        }

        return "impossible"
    }
}
