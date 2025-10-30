package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No17626Test : StringSpec({
    "Four Squares : https://www.acmicpc.net/problem/17626" {
        val testCases = listOf(
            "25" to "1",
            "26" to "2",
            "11339" to "3",
            "34567" to "4"
        )

        testCases.forEach { (given, expected) ->
            No17626().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
