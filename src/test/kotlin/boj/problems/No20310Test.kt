package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No20310Test : StringSpec({
    "타노스 : https://www.acmicpc.net/problem/20310" {
        val testCases = listOf(
            "1010" to "01",
            "000011" to "001"
        )

        testCases.forEach { (given, expected) ->
            val result = No20310().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
