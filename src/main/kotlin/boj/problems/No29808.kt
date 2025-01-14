package boj.problems

import java.io.BufferedReader

class No29808 {
    fun solve(input: BufferedReader): String {
        val s = input.readLine().toInt()
        if (s % 4763 != 0) return "0"
        val t = s / 4763
        val ans = mutableListOf<Pair<Int, Int>>()

        for (d1 in 0..200) {
            for (d2 in 0..200) {
                val m1Options = if (d1 == 0) listOf(108) else listOf(508, 108)
                val m2Options = if (d2 == 0) listOf(305) else listOf(212, 305)

                loop@ for (m1 in m1Options) {
                    for (m2 in m2Options) {
                        if (d1 * m1 + d2 * m2 == t) {
                            ans.add(Pair(d1, d2))
                            break@loop
                        }
                    }
                }
            }
        }

        ans.sortWith(compareBy({ it.first }, { it.second }))

        val sb = StringBuilder()
        sb.append("${ans.size}\n")

        if (ans.isNotEmpty()) {
            for ((a, b) in ans) {
                sb.append("$a $b\n")
            }
        }
        return sb.toString().trimEnd()
    }
}
