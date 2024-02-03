package boj.problems

import java.io.BufferedReader

object No3181 {
    fun solve(input: BufferedReader): String {
        val ignoreWords = listOf("i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili")
        val words = input.readLine().split(" ")
        return words.mapIndexedNotNull { index, word ->
            when {
                // 첫 번째 단어이거나 무시 목록에 없는 단어의 첫 글자를 대문자로 변환
                index == 0 || word !in ignoreWords -> word.first().uppercaseChar().toString()
                else -> null // 무시 목록에 있는 단어는 무시
            }
        }.joinToString("")
    }
}
