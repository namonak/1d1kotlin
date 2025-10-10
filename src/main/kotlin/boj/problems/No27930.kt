package boj.problems

import java.io.BufferedReader

class No27930 {
    fun solve(input: BufferedReader): String {
        val str = input.readLine()

        val koreaResult = findLastIndex(str, KOREA_UNIV)
        val yonseiResult = findLastIndex(str, YONSEI_UNIV)

        return when {
            koreaResult == -1 -> YONSEI_UNIV
            yonseiResult == -1 -> KOREA_UNIV
            koreaResult < yonseiResult -> KOREA_UNIV
            else -> YONSEI_UNIV
        }
    }

    private fun findLastIndex(
        str: String,
        university: String
    ): Int {
        var lastIndex = -1
        var progress = 0

        str.forEachIndexed { index, c ->
            if (progress < university.length && c == university[progress]) {
                progress++
                lastIndex = index
            }
        }

        return if (progress == university.length) lastIndex else -1
    }

    companion object {
        const val KOREA_UNIV = "KOREA"
        const val YONSEI_UNIV = "YONSEI"
    }
}
