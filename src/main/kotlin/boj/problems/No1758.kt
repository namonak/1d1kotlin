package boj.problems

import java.io.BufferedReader
import kotlin.math.max

class No1758 {
    fun solve(input: BufferedReader): String {
        val numberOfCustomers = input.readLine().toInt()

        val tips = LongArray(numberOfCustomers) {
            input.readLine().toLong()
        }

        val result = calculateMaxTotalTip(tips)

        return result.toString()
    }

    /**
     * 핵심 비즈니스 로직: 팁의 최댓값을 계산합니다.
     * 정렬 -> 팁 계산 -> 합계의 과정을 함수형으로 표현했습니다.
     */
    private fun calculateMaxTotalTip(tips: LongArray): Long {
        return tips.sortedDescending()
            .mapIndexed { rank, originalTip ->
                // 등수(rank)는 0부터 시작하므로 (등수 - 1)은 곧 index와 같습니다.
                val penalty = rank.toLong()
                calculateEffectiveTip(originalTip, penalty)
            }
            .sum()
    }

    /**
     * 개별 손님에게서 받을 수 있는 실제 팁을 계산합니다.
     * 음수가 나오면 0을 반환합니다.
     */
    private fun calculateEffectiveTip(
        originalTip: Long,
        penalty: Long
    ): Long {
        return max(0L, originalTip - penalty)
    }
}
