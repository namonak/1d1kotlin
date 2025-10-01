package boj.problems

import java.io.BufferedReader

private const val MAX_LINE_LENGTH_AND_NEWLINE = 13 // "NOT CHEATER" (11) + "\r\n" (2)

class No18766 {
    fun solve(input: BufferedReader): String {
        val testCaseCount = input.readLine().toInt()
        val out = StringBuilder(testCaseCount * MAX_LINE_LENGTH_AND_NEWLINE)

        repeat(testCaseCount) {
            input.readLine().toInt()
            val playerA = input.readLine().split(' ').toTypedArray()
            val playerB = input.readLine().split(' ').toTypedArray()

            val result = if (isCheater(playerA, playerB)) "CHEATER" else "NOT CHEATER"
            out.append(result).append('\n')
        }

        return out.toString().trimEnd()
    }

    /** 플레이어 A가 플레이어 B에게 카드 바꿔치기를 했는지 여부 */
    private fun isCheater(playerA: Array<String>, playerB: Array<String>): Boolean {
        // 1. playerA의 카드 빈도수를 Map으로 계산 (O(N))
        val countsA = playerA.groupingBy { it }.eachCount()

        // 2. playerB의 카드 빈도수를 Map으로 계산 (O(N))
        val countsB = playerB.groupingBy { it }.eachCount()

        // 3. 두 Map이 완벽하게 일치하는지 확인 (O(M), M은 고유한 카드의 개수)
        return countsA != countsB
    }
}
