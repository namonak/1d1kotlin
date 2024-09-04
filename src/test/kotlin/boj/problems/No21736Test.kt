package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No21736Test : StringSpec({
    "헌내기는 친구가 필요해 : https://www.acmicpc.net/problem/21736" {
        val testCases = listOf(
            """
                3 5
                OOOPO
                OIOOX
                OOOXP
            """.trimIndent() to "1",
            """
                3 3
                IOX
                OXP
                XPP
            """.trimIndent() to "TT"
        )

        testCases.forEach { (given, expected) ->
            No21736().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
