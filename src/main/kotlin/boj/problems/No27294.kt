package boj.problems

import java.io.BufferedReader

class No27294 {
    fun solve(input: BufferedReader): String {
        val (time, hasAlcohol) = input.readLine().trim().split(" ").map { it.toInt() }

        val isLunchTime = time in LUNCH_START_HOUR..LUNCH_END_HOUR
        val withAlcohol = hasAlcohol == FLAG_ALCOHOL

        val grains = if (isLunchTime && !withAlcohol) LUNCH_GRAINS else DEFAULT_GRAINS
        return grains.toString()
    }

    companion object {
        // 시간대 기준
        private const val LUNCH_START_HOUR = 12
        private const val LUNCH_END_HOUR = 16

        // 입력 플래그
        private const val FLAG_ALCOHOL = 1

        // 결과 값
        private const val LUNCH_GRAINS = 320 // 점심 + 술 없음
        private const val DEFAULT_GRAINS = 280 // 그 외 전부
    }
}
