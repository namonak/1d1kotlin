package boj.problems

import java.io.BufferedReader

class No5073 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()
        while (true) {
            val (a, b, c) = input.readLine().split(" ").map { it.toInt() }
            if (a == 0 && b == 0 && c == 0) break
            result.append(
                classifyTriangle(a, b, c)
            ).append("\n")
        }
        return result.toString().trim()
    }

    private fun classifyTriangle(
        a: Int,
        b: Int,
        c: Int
    ): String {
        return when {
            // 어떤 두 변의 합도 세 번째 변보다 커야 한다는 조건을 만족하지 못하는 경우
            a + b <= c || a + c <= b || b + c <= a -> "Invalid"

            // 세 변의 길이가 모두 같은 경우
            a == b && b == c -> "Equilateral"

            // 두 변의 길이만 같은 경우
            a == b || b == c || a == c -> "Isosceles"

            // 위의 모든 조건이 아니라면, 세 변의 길이가 모두 다른 경우이다.
            else -> "Scalene"
        }
    }
}
