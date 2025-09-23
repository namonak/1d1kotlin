package boj.problems

import java.io.BufferedReader

private const val TOP_ONLY_HANGER = 1
private const val BOTTOM_ONLY_HANGER = 2
private const val BOTH_HANGER = 3

private const val TOP_CLOTHING = 'U'
private const val BOTTOM_CLOTHING = 'D'

private const val YES = "YES"
private const val NO = "NO"

class No27951 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val hangers = input.readLine().split(" ").map { it.toInt() }
        val (u, d) = input.readLine().split(" ").map { it.toInt() }

        // 1. 각 종류별 옷걸이 개수를 센다.
        val topOnlyHangerCount = hangers.count { it == TOP_ONLY_HANGER }
        val bottomOnlyHangerCount = hangers.count { it == BOTTOM_ONLY_HANGER }

        // 2. 전용 옷걸이에 옷을 걸 수 있는지 확인한다. (핵심 가능성 판단)
        // 상의가 상의 전용 옷걸이보다 적거나, 하의가 하의 전용 옷걸이보다 적으면 불가능하다.
        if (u < topOnlyHangerCount || d < bottomOnlyHangerCount) {
            return NO
        }

        // 3. 가능한 경우, 옷 배치 결과를 생성한다.
        // 겸용 옷걸이에 걸어야 할 상의의 개수를 계산한다.
        var remainingTopsForBothHangers = u - topOnlyHangerCount

        val resultBuilder = StringBuilder(n)
        hangers.forEach { hangerType ->
            when (hangerType) {
                TOP_ONLY_HANGER -> {
                    resultBuilder.append(TOP_CLOTHING)
                }
                BOTTOM_ONLY_HANGER -> {
                    resultBuilder.append(BOTTOM_CLOTHING)
                }
                BOTH_HANGER -> {
                    // 겸용 옷걸이에는 남은 상의를 우선적으로 건다.
                    if (remainingTopsForBothHangers > 0) {
                        resultBuilder.append(TOP_CLOTHING)
                        remainingTopsForBothHangers--
                    } else {
                        // 남은 상의를 다 걸었으면 하의를 건다.
                        resultBuilder.append(BOTTOM_CLOTHING)
                    }
                }
            }
        }

        return "$YES\n$resultBuilder"
    }
}
