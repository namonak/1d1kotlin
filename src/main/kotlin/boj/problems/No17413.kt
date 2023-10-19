package boj.problems

import java.io.BufferedReader

fun main() {
    println(No17413.solve(System.`in`.bufferedReader()))
}

object No17413 {
    fun solve(input: BufferedReader): String {
        val s = input.readLine()
        val sb = StringBuilder()
        var isTag = false
        var word = StringBuilder()

        for (i in s.indices) {
            if (s[i] == '<') {
                isTag = true
                sb.append(word.reversed())
                word = StringBuilder()
                sb.append('<')
            } else if (s[i] == '>') {
                isTag = false
                sb.append('>')
            } else if (isTag) {
                sb.append(s[i])
            } else {
                if (s[i] == ' ') {
                    sb.append(word.reversed())
                    sb.append(' ')
                    word = StringBuilder()
                } else {
                    word.append(s[i])
                }
            }
        }

        sb.append(word.reversed())

        return sb.toString().trimEnd()
    }
}
