package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11382Test : StringSpec({
    "꼬마 정민 : https://www.acmicpc.net/problem/11382" {
        val testCases = listOf(
            "1 2 3" to "6",
            "1000000 1000000 1000000" to "3000000",
            "1000000000 1000000000 1000000000" to "3000000000"
        )

        testCases.forEach { (given, expected) ->
            No11382().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
