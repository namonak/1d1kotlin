package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No16283Test : StringSpec({
    "Farm : https://www.acmicpc.net/problem/16283" {
        val testCases = listOf(
            "3 4 9 32" to "4 5",
            "3 4 8 32" to "-1",
            "100 100 2 200" to "1 1"
        )

        testCases.forEach { (given, expected) ->
            val result = No16283().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
