package boj.problems

import java.io.BufferedReader

class No28295 {
    companion object {
        const val CMD_RIGHT = 1 // 우향우 (+90°)
        const val CMD_BACK = 2 // 뒤로 돌아 (+180°)
        const val CMD_LEFT = 3 // 좌향좌 (-90°, == +270°)
        const val MOD = 4 // 4방향: N(0), E(1), S(2), W(3)
        const val TOTAL_COMMANDS = 10
    }

    fun solve(input: BufferedReader): String {
        // 방향 인덱스: 0=N, 1=E, 2=S, 3=W
        var dir = 0
        val dirToChar = charArrayOf('N', 'E', 'S', 'W')

        repeat(TOTAL_COMMANDS) {
            val t = input.readLine().trim().toInt()
            dir = when (t) {
                CMD_RIGHT -> (dir + 1) % MOD
                CMD_BACK -> (dir + 2) % MOD
                CMD_LEFT -> (dir + 3) % MOD // == (dir - 1 + 4) % 4
                else -> dir // 문제 조건상 올 일 없음
            }
        }

        return dirToChar[dir].toString()
    }
}
