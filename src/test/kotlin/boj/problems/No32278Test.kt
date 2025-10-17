package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No32278Test : StringSpec({
    "선택 가능성이 가장 높은 자료형 : https://www.acmicpc.net/problem/32278" {
        val testCases = listOf(
            "20150116" to "int",
            "838578827378" to "long long",
            "-10" to "short",
        )

        testCases.forEach { (given, expected) ->
            val actual = No32278().solve(given.reader().buffered())

            actual shouldBe expected
        }
    }
})
