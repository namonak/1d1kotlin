package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1032Test : StringSpec({
    "명령 프롬프트 : https://www.acmicpc.net/problem/1032" {
        val testCases = listOf(
            """
                3
                config.sys
                config.inf
                configures
            """.trimIndent() to "config????",
            """
                2
                contest.txt
                context.txt
            """.trimIndent() to "conte?t.txt",
            """
                3
                c.user.mike.programs
                c.user.nike.programs
                c.user.rice.programs
            """.trimIndent() to "c.user.?i?e.programs",
            """
                4
                a
                a
                b
                b
            """.trimIndent() to "?",
            """
                1
                onlyonefile
            """.trimIndent() to "onlyonefile"
        )

        testCases.forEach { (given, expected) ->
            No1032().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
