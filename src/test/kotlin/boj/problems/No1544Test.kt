package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1544Test : StringSpec({
    "사이클 단어 : https://www.acmicpc.net/problem/1544" {
        val testCases = listOf(
            """
                5
                picture
                turepic
                icturep
                word
                ordw
            """.trimIndent() to "2",
            """
                7
                ast
                ats
                tas
                tsa
                sat
                sta
                ttt
            """.trimIndent() to "3",
            """
                5
                aaaa
                aaa
                aa
                aaaa
                aaaaa
            """.trimIndent() to "4"
        )

        for ((given, expected) in testCases) {
            No1544().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
