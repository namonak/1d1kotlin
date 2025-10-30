package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15649Test : StringSpec({
    "N과 M (1)" {
        val testCases = listOf(
            "3 1" to """
                1
                2
                3
            """.trimIndent(),
            "4 2" to """
                1 2
                1 3
                1 4
                2 1
                2 3
                2 4
                3 1
                3 2
                3 4
                4 1
                4 2
                4 3
            """.trimIndent(),
            "4 4" to """
                1 2 3 4
                1 2 4 3
                1 3 2 4
                1 3 4 2
                1 4 2 3
                1 4 3 2
                2 1 3 4
                2 1 4 3
                2 3 1 4
                2 3 4 1
                2 4 1 3
                2 4 3 1
                3 1 2 4
                3 1 4 2
                3 2 1 4
                3 2 4 1
                3 4 1 2
                3 4 2 1
                4 1 2 3
                4 1 3 2
                4 2 1 3
                4 2 3 1
                4 3 1 2
                4 3 2 1
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No15649().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
