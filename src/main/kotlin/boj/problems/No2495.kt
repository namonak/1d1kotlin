package boj.problems

import java.io.BufferedReader

class No2495 {
    fun solve(br: BufferedReader): String {
        val out = StringBuilder()
        repeat(3) {
            val s = br.readLine().trim()
            var maxRun = 1
            var run = 1
            for (i in 1 until s.length) {
                if (s[i] == s[i - 1]) {
                    run++
                } else {
                    if (run > maxRun) maxRun = run
                    run = 1
                }
            }
            if (run > maxRun) maxRun = run
            out.append(maxRun).append('\n')
        }
        return out.toString().trimEnd()
    }
}
