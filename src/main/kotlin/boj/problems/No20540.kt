package boj.problems

import java.io.BufferedReader

class No20540 {
    fun solve(input: BufferedReader): String {
        val mbti = input.readLine()
        return mbti.map {
            when (it) {
                'E' -> 'I'
                'I' -> 'E'
                'S' -> 'N'
                'N' -> 'S'
                'T' -> 'F'
                'F' -> 'T'
                'J' -> 'P'
                'P' -> 'J'
                else -> it
            }
        }.joinToString("")
    }
}
