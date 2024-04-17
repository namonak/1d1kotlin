package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1141Test : StringSpec({
    "접두사 : https://www.acmicpc.net/problem/1141" {
        val testCases = listOf(
            """
                6
                hello
                hi
                h
                run
                rerun
                running
            """.trimIndent() to "4",
            """
                6
                a
                b
                cba
                cbc
                cbb
                ccc
            """.trimIndent() to "6",
            """
                6
                a
                ab
                abc
                abcd
                abcde
                abcdef
            """.trimIndent() to "1",
            """
                3
                topcoder
                topcoder
                topcoding
            """.trimIndent() to "2"
        )

        testCases.forEach { (given, expected) ->
            No1141().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
