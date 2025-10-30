package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No26173Test : StringSpec({
    "Cup Covering : https://www.acmicpc.net/problem/26173" {
        val testCases = listOf(
            "42" to "7.3127327914",
            "20221126" to "5074.0848694393"
        )

        testCases.forEach { (given, expected) ->
            No26173().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
