package boj.problems

import java.io.BufferedReader

class No20362 {
    fun solve(input: BufferedReader): String {
        val firstLine = input.readLine().trim().split(" ")
        val n = firstLine[0].toInt()
        val s = firstLine[1]
        val chats = mutableListOf<Pair<String, String>>()

        repeat(n) {
            val (nickname, message) = input.readLine().trim().split(" ")
            chats.add(Pair(nickname, message))
        }

        val (sMessage, sIndex) = chats.withIndex().find { it.value.first == s }?.let {
            Pair(it.value.second, it.index)
        } ?: Pair("", -1)

        if (sIndex == -1) return "0"

        var count = 0
        for (i in 0 until sIndex) {
            if (chats[i].second == sMessage) {
                count++
            }
        }

        return count.toString()
    }
}
