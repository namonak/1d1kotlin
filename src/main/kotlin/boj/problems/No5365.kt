package boj.problems

import java.io.BufferedReader

class No5365 {
    fun solve(input: BufferedReader): String {
        val wordCount = input.readLine().toInt()
        val words = input.readLine().split(" ")

        if (wordCount == 0 || words.isEmpty()) return ""

        val decoded = StringBuilder()

        fun getLetter(
            word: String,
            index: Int
        ): String = if (index < word.length) word[index].toString() else " "

        decoded.append(words.first().first()) // 첫 단어는 첫 글자 사용

        for (i in 1 until wordCount) {
            val prevLength = words[i - 1].length
            decoded.append(getLetter(words[i], prevLength - 1))
        }

        return decoded.toString()
    }
}
