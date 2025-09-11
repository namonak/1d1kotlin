package boj.problems

import java.io.BufferedReader

class No20310 {
    fun solve(input: BufferedReader): String {
        val s = input.readLine()
        val n = s.length

        val total0 = s.count { it == '0' }
        val total1 = n - total0

        var toRemove0 = total0 / 2
        var toRemove1 = total1 / 2

        val removed = BooleanArray(n)

        // 왼쪽에서 오른쪽: 1 제거
        for (i in s.indices) {
            if (s[i] == '1' && toRemove1 > 0) {
                removed[i] = true
                toRemove1--
            }
        }

        // 오른쪽에서 왼쪽: 0 제거
        for (i in s.indices.reversed()) {
            if (s[i] == '0' && toRemove0 > 0 && !removed[i]) {
                removed[i] = true
                toRemove0--
            }
        }

        val result = StringBuilder()
        for (i in s.indices) {
            if (!removed[i]) result.append(s[i])
        }

        return result.toString()
    }
}
