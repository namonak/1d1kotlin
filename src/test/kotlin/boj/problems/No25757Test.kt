package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No25757Test : StringSpec({
    "임스와 함께하는 미니게임 : https://www.acmicpc.net/problem/25757" {
        val testCases = listOf(
            """
                7 Y
                lms0806
                lms0806
                exponentiale
                lms0806
                jthis
                lms0806
                leo020630
            """.trimIndent()
                to
                    4,
            """
                12 F
                lms0806
                powergee
                skeep194
                lms0806
                tony9402
                lms0806
                wider93
                lms0806
                mageek2guanaah
                lms0806
                jthis
                lms0806
            """.trimIndent()
                to
                    3,
            """
                12 O
                lms0806
                mageek2guanaah
                jthis
                lms0806
                exponentiale
                lms0806
                leo020630
                lms0806
                powergee
                lms0806
                skeep194
                lms0806
            """.trimIndent()
                to
                    2
        )

        testCases.forEach { (given, expected) ->
            No25757.solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
