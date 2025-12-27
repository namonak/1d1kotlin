package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No25775Test : StringSpec({
    "Letter Frequency : https://www.acmicpc.net/problem/25775" {
        val testCases = listOf(
            """
                5
                this
                is
                an
                example
                ink
            """.trimIndent() to """
                1: i
                2: n
                3: a i k
                4: m s
                5: p
                6: l
                7: e
            """.trimIndent(),
            """
                3
                this
                is
                longlonglong
            """.trimIndent() to """
                1: i l t
                2: h o s
                3: i n
                4: g s
                5: l
                6: o
                7: n
                8: g
                9: l
                10: o
                11: n
                12: g
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No25775().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
