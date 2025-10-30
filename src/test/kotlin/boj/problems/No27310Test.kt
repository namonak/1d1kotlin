package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No27310Test : StringSpec({
    ":chino_shock: : https://www.acmicpc.net/problem/27310" {
        val testCases = listOf(
            ":chino_shock:" to "20",
            ":chinoaww:" to "12",
            ":chino_very_shock:" to "30"
        )

        testCases.forEach { (given, expected) ->
            val actual = No27310().solve(given.reader().buffered())
            actual shouldBe expected
        }
    }
})
