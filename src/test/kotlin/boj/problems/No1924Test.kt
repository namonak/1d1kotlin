package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1924Test : StringSpec({
    "2007년 : https://www.acmicpc.net/problem/1924" {
        val testCases = listOf(
            "1 1" to "MON",
            "3 14" to "WED",
            "9 2" to "SUN",
            "12 25" to "TUE"
        )

        testCases.forEach { (given, expected) ->
            val actual = No1924().solve(given.reader().buffered())

            actual shouldBe expected
        }
    }
})
