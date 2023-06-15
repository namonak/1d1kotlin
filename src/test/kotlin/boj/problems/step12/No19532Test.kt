package boj.problems.step12

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No19532Test : StringSpec({
    "수학은 비대면강의입니다 : https://www.acmicpc.net/problem/19532" {
        val testCases = listOf(
            "1 3 -1 4 1 7" to "2 -1",
            "2 5 8 3 -4 -11" to "-1 2"
        )

        testCases.forEach { (given, expected) ->
            val actual = No19532.solve(BufferedReader(given.reader()))
            actual shouldBe expected
        }
    }
})
