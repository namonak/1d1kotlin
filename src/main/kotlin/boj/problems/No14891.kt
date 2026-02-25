package boj.problems

import java.io.BufferedReader

class No14891 {
    // 각 기어의 톱니 상태 (4개 기어 × 8개 톱니)
    var gear: Array<IntArray> = Array(4) { IntArray(8) }

    // 각 기어의 12시 방향 인덱스
    var top: IntArray = IntArray(4)

    fun solve(input: BufferedReader): String {
        for (i in 0..3) {
            val line = input.readLine().trim { it <= ' ' }
            for (j in 0..7) {
                gear[i][j] = line[j].code - '0'.code
            }
            top[i] = 0 // 초기 12시 방향은 index 0
        }

        var k = input.readLine().trim { it <= ' ' }.toInt()

        while (k-- > 0) {
            val parts: Array<String?> =
                input.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val idx = parts[0]!!.toInt() - 1 // 0-based
            val dir = parts[1]!!.toInt() // 1 or -1

            rotateAll(idx, dir)
        }

        // 3. 점수 계산
        var score = 0
        if (getTop(0) == 1) score += 1
        if (getTop(1) == 1) score += 2
        if (getTop(2) == 1) score += 4
        if (getTop(3) == 1) score += 8

        return score.toString()
    }

    /** 전체 회전 처리: 방향 전파 후 실제 회전 적용  */
    private fun rotateAll(
        startIdx: Int,
        startDir: Int
    ) {
        val dirs = IntArray(4) // 각 기어 회전 방향: 0, 1, -1
        dirs[startIdx] = startDir

        // 왼쪽 전파
        var d = startDir
        for (i in startIdx - 1 downTo 0) {
            // 오른쪽(i+1)의 왼쪽 톱니 index = (top + 6) % 8
            val rightLeft = gear[i + 1][(top[i + 1] + 6) % 8]

            // 현재(i)의 오른쪽 톱니 index = (top + 2) % 8
            val leftRight = gear[i][(top[i] + 2) % 8]

            if (leftRight != rightLeft) {
                d = -d
                dirs[i] = d
            } else {
                break
            }
        }

        // 오른쪽 전파
        d = startDir
        for (i in startIdx + 1..3) {
            val leftRight = gear[i - 1][(top[i - 1] + 2) % 8]
            val rightLeft = gear[i][(top[i] + 6) % 8]

            if (leftRight != rightLeft) {
                d = -d
                dirs[i] = d
            } else {
                break
            }
        }

        // 최종 회전 적용
        for (i in 0..3) {
            if (dirs[i] == 1) {
                // 시계 방향 → top -= 1
                top[i] = (top[i] + 7) % 8
            } else if (dirs[i] == -1) {
                // 반시계 방향 → top += 1
                top[i] = (top[i] + 1) % 8
            }
        }
    }

    /** 특정 기어의 Top(12시 방향 톱니) 값 반환  */
    private fun getTop(i: Int): Int {
        return gear[i][top[i]]
    }
}
