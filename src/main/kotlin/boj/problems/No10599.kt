package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No10599 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()

        while (true) {
            val st = StringTokenizer(input.readLine())
            val a = st.nextToken().toInt()
            val b = st.nextToken().toInt()
            val c = st.nextToken().toInt()
            val d = st.nextToken().toInt()

            // 종료 조건
            if (a == 0 && b == 0 && c == 0 && d == 0) {
                break
            }

            // 나이의 최소값: (가장 일찍 죽었을 때) - (가장 늦게 태어났을 때)
            val minAge = c - b
            // 나이의 최대값: (가장 늦게 죽었을 때) - (가장 일찍 태어났을 때)
            val maxAge = d - a

            result.append("$minAge $maxAge\n")
        }

        return result.toString().trimEnd()
    }
}
