package boj.problems

import java.io.BufferedReader

class No25593 {
    fun solve(input: BufferedReader): String {
        val br = input
        val n = br.readLine().toInt()
        // 교대별 근무시간
        val shiftHours = listOf(4, 6, 4, 10)
        // 사람별 누적 근무시간 기록
        val workTime = mutableMapOf<String, Int>()

        repeat(n) {
            // 4교대
            for (i in 0 until 4) {
                val tokens = br.readLine().split(" ")
                for (name in tokens) {
                    if (name != "-") {
                        workTime[name] = workTime.getOrDefault(name, 0) + shiftHours[i]
                    }
                }
            }
        }

        // 아무도 근무하지 않았으면 공평
        if (workTime.isEmpty()) return "Yes"

        // 최댓값·최솟값 차이 검사
        val times = workTime.values
        val maxTime = times.maxOrNull()!!
        val minTime = times.minOrNull()!!
        return if (maxTime - minTime <= 12) "Yes" else "No"
    }
}
