package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No5648 {
    fun solve(input: BufferedReader): String {
        val tokenizer = InputTokenizer(input)
        val n = tokenizer.next()?.toInt() ?: return ""
        val sortedElements = (1..n)
            .mapNotNull { tokenizer.next() }
            .map { it.reversed().toLong() }
            .sorted()

        return sortedElements.joinToString("\n")
    }

    private class InputTokenizer(private val reader: BufferedReader) {
        private var st: StringTokenizer? = null

        fun next(): String? {
            while (st == null || !st!!.hasMoreElements()) {
                val line = reader.readLine() ?: return null
                st = StringTokenizer(line)
            }
            return st!!.nextToken()
        }
    }
}
