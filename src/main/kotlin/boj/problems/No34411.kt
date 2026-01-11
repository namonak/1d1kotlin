package boj.problems

import java.io.BufferedReader

class No34411 {
    /**
     * M-Climb 문제 해결 함수
     * * @param input 표준 입력 스트림 (BufferedReader)
     * @return 총 페인트 비용 (String)
     */
    fun solve(input: BufferedReader): String {
        // 1. 입력 파싱
        // 첫 번째 줄: 돌의 개수 (m)
        val numberOfRocks = input.readLine().trim().toInt()

        // 두 번째 줄: 리터당 페인트 가격 (n)
        val costPerLiter = input.readLine().trim().toInt()

        // 세 번째 줄: 연도 (y) - 계산에 필요 없으므로 읽고 버림
        input.readLine()

        // 2. 비용 계산
        // 돌 1개당 1리터가 필요하므로: 총 비용 = 돌 개수 * 리터당 가격
        val totalBudget = numberOfRocks * costPerLiter

        // 3. 결과 반환
        return totalBudget.toString()
    }
}
