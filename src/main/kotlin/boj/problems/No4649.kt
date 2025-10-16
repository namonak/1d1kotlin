package boj.problems

import java.io.BufferedReader

class No4649 {
    fun solve(input: BufferedReader): String {
        val results = mutableListOf<String>()
        while (true) {
            val line = input.readLine() ?: break
            if (line.trim() == END_MARKER) break

            val (bedsStr, sequence) = line.split(" ", limit = 2)
            val beds = bedsStr.toInt()
            results += simulateSalon(beds, sequence)
        }
        return results.joinToString("\n")
    }

    private fun simulateSalon(
        beds: Int,
        sequence: String
    ): String {
        // 상태 추적: 현재 선탠 중 / 도착 시 돌아간 손님
        val tanning = BooleanArray(ALPHABET) // true면 현재 침대 사용 중
        val walked = BooleanArray(ALPHABET) // true면 도착 시 만석이라 돌아감
        var occupied = 0
        var walkedCount = 0

        for (c in sequence) {
            val idx = c - 'A'
            when {
                !tanning[idx] && !walked[idx] -> { // 첫 방문(입장 시도)
                    if (occupied < beds) {
                        tanning[idx] = true
                        occupied++
                    } else {
                        walked[idx] = true
                        walkedCount++
                    }
                }
                tanning[idx] -> { // 현재 선탠 중이던 손님의 퇴장
                    tanning[idx] = false
                    occupied--
                }
                else -> {
                    // 이미 walked인 손님의 두 번째 등장은 무시
                }
            }
        }

        return if (walkedCount == 0) {
            SUCCESS_MESSAGE
        } else {
            "$walkedCount customer(s) walked away."
        }
    }

    companion object {
        private const val END_MARKER = "0"
        private const val ALPHABET = 26
        private const val SUCCESS_MESSAGE = "All customers tanned successfully."
    }
}
