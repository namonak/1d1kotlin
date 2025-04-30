package boj.problems

import java.io.BufferedReader

class No7795 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) {
            val (_, _) = input.readLine().split(" ").map { it.toInt() }
            val a = input.readLine().split(" ").map { it.toInt() }.sorted()
            val b = input.readLine().split(" ").map { it.toInt() }.sorted()

            var count = 0L
            var j = 0
            // 두 포인터: a의 각 원소 ai에 대해 B 중 ai보다 작은 원소 개수를 j로 유지
            for (ai in a) {
                while (j < b.size && b[j] < ai) {
                    j++
                }
                count += j
            }

            result.append(count).append('\n')
        }

        return result.toString().trimEnd()
    }
}
