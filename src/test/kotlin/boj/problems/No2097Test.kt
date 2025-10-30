package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2097Test : StringSpec({
    "조약돌 : https://www.acmicpc.net/problem/2097" {
        val testCases = listOf(
            "5" to "6",
            "14" to "12"
        )

        testCases.forEach { (given, expected) ->
            No2097().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
