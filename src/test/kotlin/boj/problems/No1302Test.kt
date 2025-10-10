package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1302Test : StringSpec({
    "베스트셀러 : https://www.acmicpc.net/problem/1302" {
        val testCases = listOf(
            """
                5
                top
                top
                top
                top
                kimtop
            """.trimIndent() to
                "top",
            """
                9
                table
                chair
                table
                table
                lamp
                door
                lamp
                table
                chair
            """.trimIndent() to
                "table",
            """
                6
                a
                a
                a
                b
                b
                b
            """.trimIndent() to
                "a",
            """
                8
                icecream
                peanuts
                peanuts
                chocolate
                candy
                chocolate
                icecream
                apple
            """.trimIndent() to
                "chocolate",
            """
                1
                soul
            """.trimIndent() to
                "soul"
        )

        testCases.forEach { (given, expected) ->
            No1302.solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
