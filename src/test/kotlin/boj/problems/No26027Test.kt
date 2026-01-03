package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldBe

class No26027Test : StringSpec({
    "Disc District https://www.acmicpc.net/problem/26027: " {
        val testCases = listOf(
            "1" to "1 1",
            "8" to "4 7",
            "90210" to "69551 57450"
        )

        for ((given, expected) in testCases) {
            val r = given.toLong()
            val actual = No26027().solve(given.reader().buffered())

            // 1. 결과 파싱
            val (x, y) = actual.split(" ").map { it.toLong() }

            // 2. 예제 정답 파싱 (비교 기준을 만들기 위해)
            val (ex, ey) = expected.split(" ").map { it.toLong() }

            val myDistSq = x * x + y * y
            val expectedDistSq = ex * ex + ey * ey

            // [검증 1] 원의 밖에 존재하는가? (문제 조건: strictly larger than r)
            (myDistSq > r * r).shouldBeTrue()

            // [검증 2] 예제 출력만큼 효율적인 답인가? (거리의 제곱이 같아야 함)
            // 참고: 이 문제의 경우 항상 r^2 + 1이 최솟값이므로 expectedDistSq 대신 r*r+1과 비교해도 됩니다.
            myDistSq shouldBe expectedDistSq

            println("Input: $r | My Output: $x $y (Dist^2: $myDistSq) - PASS")
        }
    }
})
