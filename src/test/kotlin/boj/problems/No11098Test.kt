package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11098Test : StringSpec({
    "첼시를 도와줘! https://www.acmicpc.net/problem/11098" {
        val given = """
            2
            3
            10 Iversen
            1000000 Nannskog
            2000000 Ronaldinho
            2
            1000000 Maradona
            999999 Batistuta
        """.trimIndent()
        val expected = """
            Ronaldinho
            Maradona
        """.trimIndent()

        No11098.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
