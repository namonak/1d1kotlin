package boj.problems

import java.io.BufferedReader

class No22233 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map(String::toInt)
        val keywords = HashSet<String>(n).apply {
            repeat(n) { add(input.readLine()) }
        }
        val sb = StringBuilder()

        repeat(m) {
            input.readLine()
                .split(",")
                .forEach { kw ->
                    if (kw in keywords) keywords.remove(kw)
                }
            sb.append(keywords.size).append('\n')
        }

        return sb.toString().trimEnd()
    }
}
