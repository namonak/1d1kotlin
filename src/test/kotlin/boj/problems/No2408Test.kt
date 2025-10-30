package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2408Test : StringSpec({
    "큰 수 계산 : https://www.acmicpc.net/problem/2408" {
        val given = """
            4
            2
            *
            3
            +
            1
            *
            4
        """.trimIndent()
        val expected = "10"

        val actual = No2408().solve(given.reader().buffered())
        actual shouldBe expected
    }
})
