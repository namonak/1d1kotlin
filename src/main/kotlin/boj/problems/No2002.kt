package boj.problems

import java.io.BufferedReader

class No2002 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().trim().toInt()

        // 입구 순서 → 인덱스 맵
        val entryIndex = mutableMapOf<String, Int>()
        repeat(n) { i ->
            entryIndex[input.readLine().trim()] = i
        }

        // 각 인덱스가 출구로 나왔는지 표시
        val exited = BooleanArray(n)
        // 아직 출구로 나오지 않은 차들 중 가장 작은 인덱스
        var smallestNotExited = 0

        var overtakeCount = 0

        // 출구 순서대로 처리
        repeat(n) {
            val car = input.readLine().trim()
            val idx = entryIndex[car]!!

            if (idx > smallestNotExited) {
                // 자신보다 앞서 들어간 차가 아직 터널에 남아 있었음 → 추월
                overtakeCount++
            } else {
                // idx == smallestNotExited 인 경우에만
                // 차례대로 모두 나간 것이므로, 다음 남은 차 중 최소 인덱스를 갱신
                smallestNotExited++
                while (smallestNotExited < n && exited[smallestNotExited]) {
                    smallestNotExited++
                }
            }

            exited[idx] = true
        }

        return overtakeCount.toString()
    }
}
