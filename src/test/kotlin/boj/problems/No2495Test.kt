package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2495Test : StringSpec({
    "연속구간 : https://www.acmicpc.net/problem/2495" {
        val given = """
            12345123
            17772345
            22233331
        """.trimIndent()
        val expected = """
            1
            3
            4
        """.trimIndent()

        val result = No2495().solve(given.reader().buffered())
        result.trim() shouldBe expected
    }
})
