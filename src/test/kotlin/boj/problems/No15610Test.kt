package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15610Test : StringSpec({
    "Abbey Courtyard : https://www.acmicpc.net/problem/15610" {
        val testCases = listOf(
            "64" to "32.0",
            "1234" to "140.51334456200237"
        )

        testCases.forEach { (given, expected) ->
            No15610().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
