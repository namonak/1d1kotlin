package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No32288Test : StringSpec({
    "바코드 닉네임 : https://www.acmicpc.net/problem/32288" {
        val given = """
            10
            IllIllIlIl
        """.trimIndent()
        val expected = "iLLiLLiLiL"

        No32288().solve(given.reader().buffered()) shouldBe expected
    }
})
