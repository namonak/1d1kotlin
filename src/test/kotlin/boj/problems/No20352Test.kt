package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No20352Test : StringSpec({
    "Circus : https://www.acmicpc.net/problem/20352" {
        val testCases = listOf(
            "64" to "28.359262",
            "1234" to "124.526709"
        )

        testCases.forEach { (given, expected) ->
            No20352().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
