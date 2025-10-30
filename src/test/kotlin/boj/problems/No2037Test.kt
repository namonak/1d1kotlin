package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2037Test : StringSpec({
    "문자메시지 : https://www.acmicpc.net/problem/2037" {
        val given = """
            2 10
            ABBAS SALAM
        """.trimIndent()
        val expected = "72"

        No2037().solve(given.reader().buffered()) shouldBe expected
    }
})
