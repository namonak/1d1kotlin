package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5013Test : StringSpec({
    "Death Knight Hero : https://www.acmicpc.net/problem/5013" {
        val given = """
            3
            DCOOO
            DODOCD
            COD
        """.trimIndent()
        val expected = "2"

        No5013().solve(given.reader().buffered()) shouldBe expected
    }
})
