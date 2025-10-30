package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10546Test : StringSpec({
    "배부른 마라토너 : https://www.acmicpc.net/problem/10546" {
        val testCases = listOf(
            """
                3
                leo
                kiki
                eden
                eden
                kiki
            """.trimIndent() to "leo",
            """
                5
                marina
                josipa
                nikola
                vinko
                filipa
                josipa
                filipa
                marina
                nikola
            """.trimIndent() to "vinko",
            """
                4
                mislav
                stanko
                mislav
                ana
                stanko
                ana
                mislav
            """.trimIndent() to "mislav"
        )

        testCases.forEach { (given, expected) ->
            No10546().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
