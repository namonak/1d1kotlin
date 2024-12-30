package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No31628Test : StringSpec({
    "가지 한 두름 주세요 : https://www.acmicpc.net/problem/31628" {
        val testCases = listOf(
            """
                r r r r r r r r r r
                g b g b g b g b g b
                g b g b g b g b g b
                g b g b g b g b g b
                g b g b g b g b g b
                g b g b g b g b g b
                g b g b g b g b g b
                g b g b g b g b g b
                g b g b g b g b g b
                g b g b g b g b g b
            """.trimIndent() to "1",
            """
                r b g b g b g b g b
                r g b g b g b g b g
                r b g b g b g b g b
                r g b g b g b g b g
                r b g b g b g b g b
                r g b g b g b g b g
                r b g b g b g b g b
                r g b g b g b g b g
                r b g b g b g b g b
                r g b g b g b g b g
            """.trimIndent() to "1",
            """
                chipi chapa chipi chapa chipi chapa chipi chapa chipi chapa
                chapa chipi chapa chipi chapa chipi chapa chipi chapa chipi
                chipi chapa chipi chapa chipi chapa chipi chapa chipi chapa
                chapa chipi chapa chipi chapa chipi chapa chipi chapa chipi
                chipi chapa chipi chapa chipi chapa chipi chapa chipi chapa
                chapa chipi chapa chipi chapa chipi chapa chipi chapa chipi
                chipi chapa chipi chapa chipi chapa chipi chapa chipi chapa
                chapa chipi chapa chipi chapa chipi chapa chipi chapa chipi
                chipi chapa chipi chapa chipi chapa chipi chapa chipi chapa
                chapa chipi chapa chipi chapa chipi chapa chipi chapa chipi
            """.trimIndent() to "0"
        )

        testCases.forEach { (given, expected) ->
            No31628().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
