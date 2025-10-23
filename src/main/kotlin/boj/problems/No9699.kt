package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No9699 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().trim().toInt()
        val out = StringBuilder()

        repeat(t) { idx ->
            val st = StringTokenizer(input.readLine())
            var maxWeight = Int.MIN_VALUE
            repeat(5) {
                val w = st.nextToken().toInt()
                if (w > maxWeight) maxWeight = w
            }
            out.append("Case #${idx + 1}: ").append(maxWeight).append('\n')
        }

        return out.toString().trimEnd()
    }
}
