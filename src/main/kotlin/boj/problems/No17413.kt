package boj.problems

import java.io.BufferedReader

class No17413 {
    fun solve(input: BufferedReader): String {
        val s = input.readLine()
        val sb = StringBuilder()
        var isTag = false
        var word = StringBuilder()

        for (i in s.indices) {
            when {
                s[i] == '<' -> {
                    isTag = true
                    sb.append(word.reversed())
                    word = StringBuilder()
                    sb.append('<')
                }
                s[i] == '>' -> {
                    isTag = false
                    sb.append('>')
                }
                isTag -> sb.append(s[i])
                s[i] == ' ' -> {
                    sb.append(word.reversed())
                    sb.append(' ')
                    word = StringBuilder()
                }
                else -> word.append(s[i])
            }
        }

        sb.append(word.reversed())

        return sb.toString().trimEnd()
    }
}
