package boj.problems

import java.io.BufferedReader

class No26027 {
    fun solve(input: BufferedReader): String {
        val r = input.readLine().trim().toLong()
        // (r, 1)은 항상 r^2 + 1의 거리를 가지며 이는 가능한 최소 거리입니다.
        return "$r 1"
    }
}
