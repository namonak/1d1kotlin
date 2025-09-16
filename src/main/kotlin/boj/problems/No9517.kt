package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No9517 {
    private companion object {
        const val TOTAL_TIME = 210
        const val PLAYER_COUNT = 8
    }

    fun solve(input: BufferedReader): String {
        val startHolder = input.readLine().trim().toInt()
        val qCount = input.readLine().trim().toInt()

        var holder = startHolder
        var elapsed = 0

        repeat(qCount) {
            val st = StringTokenizer(input.readLine())
            val t = st.nextToken().toInt() // 소요 시간(초)
            val z = st.nextToken()[0] // 'T' | 'N' | 'P'

            // 현재 보유자가 t초 동안 답변 진행
            if (elapsed + t >= TOTAL_TIME) {
                // 이 구간 중에 폭탄이 터짐 => 넘기기 전에 터지므로 현재 보유자가 폭발자
                return holder.toString().trimEnd()
            }

            elapsed += t

            // 정답이면 왼쪽(다음 사람)에게 즉시 전달
            if (z == 'T') {
                holder = next(holder)
            }
            // 오답/스킵이면 그대로 유지
        }

        // 문제 보장상 항상 터지는 입력만 주어지므로 여긴 오지 않음
        return holder.toString().trimEnd()
    }

    private fun next(curr: Int): Int = if (curr == PLAYER_COUNT) 1 else curr + 1
}
