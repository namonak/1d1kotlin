package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30958Test : StringSpec({
    "서울사이버대학을 다니고 : https://www.acmicpc.net/problem/30958" {
        val testCases = listOf(
            """
                255
                my era of success began with seoul cyber university, since attending seoul cyber university, more companies have been seeking me out, my life has changed since i went to seoul cyber university, the strategy that changes the future, seoul cyber university.
            """.trimIndent() to "34",
            """
                1
                m
            """.trimIndent() to "1",
            """
                51
                my era of success began with seoul cyber university
            """.trimIndent() to "6"
        )

        testCases.forEach { (given, expected) ->
            No30958().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
