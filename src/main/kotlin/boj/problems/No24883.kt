package boj.problems

import java.io.BufferedReader

class No24883 {
    fun solve(input: BufferedReader): String {
        val char = input.readLine()[0]
        return if (char == 'N' || char == 'n') "Naver D2" else "Naver Whale"
    }
}
