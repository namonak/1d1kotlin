package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No8974 {
    fun solve(input: BufferedReader): String {
        val st = StringTokenizer(input.readLine())
        val start = st.nextToken().toInt()
        val end = st.nextToken().toInt()

        // 1. 수열을 생성합니다. (1이 1개, 2가 2개...)
        val sequence = generateSequence()

        // 2. A번째부터 B번째까지의 합을 계산합니다.
        // index는 0부터 시작하므로 A-1부터 B-1까지 slice 합니다.
        val result = sequence
            .slice(start - 1 until end)
            .sum()

        return result.toString()
    }

    /**
     * 문제의 규칙(1이 1개, 2가 2개...)에 맞는 수열을 리스트로 생성합니다.
     * B의 최대값이 1000이므로 넉넉하게 생성합니다.
     */
    private fun generateSequence(): List<Int> {
        return mutableListOf<Int>().apply {
            var currentNumber = 1
            while (size < 1000) {
                repeat(currentNumber) {
                    if (size < 1000) add(currentNumber)
                }
                currentNumber++
            }
        }
    }
}
