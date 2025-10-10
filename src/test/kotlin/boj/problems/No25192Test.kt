package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No25192Test : StringSpec({
    "인사성 밝은 곰곰이" {
        val testCases = listOf(
            """
                9
                ENTER
                pjshwa
                chansol
                chogahui05
                ENTER
                pjshwa
                chansol
                chogahui05
                ENTER
            """.trimIndent() to "7",
            """
                3
                ENTER
                lms0806
                lms0806
            """.trimIndent() to "1",
            """
                7
                ENTER
                pjshwa
                chansol
                chogahui05
                ENTER
                pjshwa
                chansol
            """.trimIndent() to "5",
        )

        testCases.forEach { (given, expected) ->
            val input = BufferedReader(StringReader(given))
            No25192.solve(input) shouldBe expected
        }
    }
})
