package boj.problems

import java.io.BufferedReader

class No4766 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()

        // 첫 번째 온도는 비교 대상이 없으므로 초기값으로 설정합니다.
        var previousTemperature = input.readLine().toDouble()

        while (true) {
            val line = input.readLine() ?: break
            val currentTemperature = line.toDouble()

            // 마지막 신호인 999가 들어오면 종료합니다.
            if (currentTemperature == TERMINATOR) {
                break
            }

            // 온도 변화량을 계산하고 포맷팅합니다.
            val temperatureDifference = currentTemperature - previousTemperature
            result.append(formatDifference(temperatureDifference)).append("\n")

            // 다음 계산을 위해 현재 온도를 이전 온도로 갱신합니다.
            previousTemperature = currentTemperature
        }

        return result.toString().trimEnd()
    }

    private fun formatDifference(value: Double): String {
        return String.format("%.2f", value)
    }

    companion object {
        private const val TERMINATOR = 999.0
    }
}
