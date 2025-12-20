package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No8321 {
    /**
     * @param input BufferedReader를 통해 입력을 받습니다.
     * @return 최소 상자 개수를 문자열로 반환합니다.
     */
    fun solve(input: BufferedReader): String {
        // 1. 입력 파싱
        val firstLine = input.readLine() ?: return "0"
        val st = StringTokenizer(firstLine)

        st.nextToken().toInt() // n: 상자 수 (사용하지 않음)
        val screwsPerTable = st.nextToken().toInt() // k: 테이블당 필요한 나사
        val tablesToMake = st.nextToken().toInt() // s: 만들어야 할 테이블 수

        val totalScrewsRequired = screwsPerTable * tablesToMake

        // 2. 각 상자의 나사 개수 입력 및 정렬
        val secondLine = input.readLine() ?: return "0"
        val boxes = StringTokenizer(secondLine)
        val screwCounts = mutableListOf<Int>()

        while (boxes.hasMoreTokens()) {
            screwCounts.add(boxes.nextToken().toInt())
        }

        // 3. 그리디 전략: 가장 나사가 많이 든 상자부터 내림차순 정렬
        screwCounts.sortDescending()

        // 4. 최소 상자 개수 계산
        var currentScrewSum = 0
        var boxesUsed = 0

        for (screws in screwCounts) {
            if (currentScrewSum >= totalScrewsRequired) break

            currentScrewSum += screws
            boxesUsed++
        }

        return boxesUsed.toString()
    }
}
