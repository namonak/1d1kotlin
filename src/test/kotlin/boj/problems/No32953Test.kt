package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No32953Test : StringSpec({
    "회상 : https://www.acmicpc.net/problem/32953" {
        val testCases = listOf(
            """
                3 2
                3
                12500001 12500002 12500003
                5
                12500001 12500003 12500005 12500007 12500009
                4
                12500001 12500004 12500007 12500010
            """.trimIndent() to "3",
            """
                3 2
                3
                12599999 12599998 12599997
                1
                12599996
                2
                12599995 12599994
            """.trimIndent() to "0"
        )

        testCases.forEach { (given, expected) ->
            No32953().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
