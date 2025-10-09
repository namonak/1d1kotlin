package boj.problems

import java.io.BufferedReader

class No10833 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()

        var totalLeftover = 0
        repeat(n) {
            val (students, apples) = input.readLine().split(" ").map { it.toInt() }
            // 각 학교에서 남는 사과 = 배정된 사과 % 학생 수
            totalLeftover += (apples % students)
        }

        return totalLeftover.toString()
    }
}
