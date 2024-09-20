package boj.problems

import java.io.BufferedReader

class No31428 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val friendsTracks = input.readLine().split(" ")
        val hellobitTrack = input.readLine()

        return friendsTracks.count { it == hellobitTrack }.toString()
    }
}
