package boj.problems

import java.io.BufferedReader
import kotlin.math.atan2
import kotlin.math.roundToInt

class No11371 {
    fun solve(input: BufferedReader): String {
        val output = StringBuilder()

        while (true) {
            val (x, y) = input.readLine().split(' ').map { it.toDouble() }

            if (x == 0.0 && y == 0.0) break

            /**
             * atan2(y, x)는 원점(0,0)에서 (x,y)까지의 각도를 라디안으로 반환합니다.
             * math.toDegrees()를 사용하여 라디안을 도(Degree) 단위로 변환합니다.
             * roundToInt()를 사용하여 가장 가까운 정수로 반올림합니다.
             */
            val radians = atan2(y, x)
            val degrees = Math.toDegrees(radians)
            val result = degrees.roundToInt()

            output.append(result).append("\n")
        }

        return output.toString().trim()
    }
}
