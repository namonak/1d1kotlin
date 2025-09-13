package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No27522 {
    fun solve(input: BufferedReader): String {
        data class Racer(val timeMs: Int, val team: Char)

        val racers = ArrayList<Racer>(8)
        repeat(8) {
            val st = StringTokenizer(input.readLine())
            val timeStr = st.nextToken() // M:SS:sss
            val team = st.nextToken()[0] // 'R' or 'B'
            racers += Racer(parseTimeMs(timeStr), team)
        }

        // 빠른 기록(작은 ms) 순으로 정렬 = 높은 순위
        racers.sortBy { it.timeMs }

        val scores = intArrayOf(10, 8, 6, 5, 4, 3, 2, 1)

        var redSum = 0
        var blueSum = 0
        var redBest = Int.MAX_VALUE
        var blueBest = Int.MAX_VALUE

        for ((idx, r) in racers.withIndex()) {
            val rank = idx + 1
            val score = scores[idx]
            if (r.team == 'R') {
                redSum += score
                if (rank < redBest) redBest = rank
            } else {
                blueSum += score
                if (rank < blueBest) blueBest = rank
            }
        }

        return when {
            redSum > blueSum -> "Red"
            redSum < blueSum -> "Blue"
            // 동점이면 최고 순위(작은 등수)가 더 좋은 팀 승
            else -> if (redBest < blueBest) "Red" else "Blue"
        }
    }

    private fun parseTimeMs(s: String): Int {
        // M:SS:sss  (M: 0..9, SS: 00..59, sss: 000..999)
        val parts = s.split(':')
        val m = parts[0].toInt()
        val ss = parts[1].toInt()
        val ms = parts[2].toInt()
        return m * 60_000 + ss * 1_000 + ms
    }
}
