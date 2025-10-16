package boj.problems

import java.io.BufferedReader

private const val HANGUL_INDEX_OFFSET: Int = '가'.code - 1

class No11283 {
    fun solve(input: BufferedReader): String {
        val ch = input.readLine().first()
        return (ch.code - HANGUL_INDEX_OFFSET).toString()
    }
}
