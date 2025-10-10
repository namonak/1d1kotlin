package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No16435Test : StringSpec({
    "스네이크버드" {
        val testCases = listOf(
            """
                3 10
                10 11 13
            """.trimIndent() to "13",
            """
                9 1
                9 5 8 1 3 2 7 6 4
            """.trimIndent() to "10"
        )

        testCases.forEach { (given, expected) ->
            No16435.solve(given.reader().buffered()) shouldBe expected
        }
    }
})
