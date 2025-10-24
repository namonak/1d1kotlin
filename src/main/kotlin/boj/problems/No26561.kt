package boj.problems

import java.io.BufferedReader

private const val BIRTH_SEC = 4L
private const val DEATH_SEC = 7L

class No26561 {
    fun solve(input: BufferedReader): String {
        val tcs = input.readLine().trim().toInt()
        val out = StringBuilder()

        repeat(tcs) {
            val (p, t) = input.readLine().trim().split(" ").map { it.toLong() }
            val births = t / BIRTH_SEC
            val deaths = t / DEATH_SEC
            val result = p + births - deaths

            out.append(result).append('\n')
        }
        return out.toString().trimEnd()
    }
}
