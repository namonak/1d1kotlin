package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No11728Test : StringSpec({
    "배열 합치기 : https://www.acmicpc.net/problem/11728" {
        val testCases = listOf(
            "2 2\n3 5\n2 9" to "2 3 5 9",
            "2 1\n4 7\n1" to "1 4 7",
            "4 3\n2 3 5 9\n1 4 7" to "1 2 3 4 5 7 9"
        )

        testCases.forEach { (given, expected) ->
            val actual = No11728.solve(BufferedReader(given.reader()))

            actual shouldBe expected
        }
    }
})
