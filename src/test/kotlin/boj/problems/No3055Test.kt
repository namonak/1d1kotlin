package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No3055Test : StringSpec({
    "탈출 : https://www.acmicpc.net/problem/3055" {
        val testCases = listOf(
            """
                3 3
                D.*
                ...
                .S.
            """.trimIndent() to "3",
            """
                3 3
                D.*
                ...
                ..S
            """.trimIndent() to "KAKTUS",
            """
                3 6
                D...*.
                .X.X..
                ....S.
            """.trimIndent() to "6",
            """
                5 4
                .D.*
                ....
                ..X.
                S.*.
                ....
            """.trimIndent() to "4"
        )

        for ((given, expected) in testCases) {
            No3055().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
