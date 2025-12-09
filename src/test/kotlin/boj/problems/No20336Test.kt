package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No20336Test : StringSpec({
    "Haughty Cuisine : https://www.acmicpc.net/problem/20336" {
        val testCases = listOf(
            """
                3
                2 bigburger fries
                2 pizza garlicbread
                2 macaroni cheese
            """.trimIndent() to """
                2
                bigburger
                fries
            """.trimIndent(),
            """
                4
                2 pasta pizza
                3 icecream sweets pasta
                1 megapizza
                2 icecream pizza
            """.trimIndent() to """
                2
                pasta
                pizza
            """.trimIndent()
        )

        for ((given, expected) in testCases) {
            No20336().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
