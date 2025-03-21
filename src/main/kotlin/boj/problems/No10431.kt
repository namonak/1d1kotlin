package boj.problems

import java.io.BufferedReader

class No10431 {
    fun solve(input: BufferedReader): String {
        val p = input.readLine().toInt()
        val result = StringBuilder()

        repeat(p) {
            val tokens = input.readLine().split(" ")
            val testCaseNumber = tokens[0].toInt()
            val heights = tokens.drop(1).map { it.toInt() }

            var moves = 0
            val line = mutableListOf<Int>()

            heights.forEach { currentHeight ->
                var inserted = false
                for (index in line.indices) {
                    if (line[index] > currentHeight) {
                        // currentHeight가 line[index]보다 작으면 이 앞에 삽입
                        line.add(index, currentHeight)
                        moves += (line.size - index - 1)
                        inserted = true
                        break
                    }
                }
                if (!inserted) {
                    // 아무도 currentHeight보다 크지 않으면 맨 뒤에 추가
                    line.add(currentHeight)
                }
            }

            result.append("$testCaseNumber $moves\n")
        }

        return result.toString().trim()
    }
}
