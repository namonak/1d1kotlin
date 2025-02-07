package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No10179Test : StringSpec({
    "쿠폰 : https://www.acmicpc.net/problem/10179" {
        val given = """
            3
            100.00
            59.99
            20.00
        """.trimIndent()
        val expected = """
            ${'$'}80.00
            ${'$'}47.99
            ${'$'}16.00
        """.trimIndent()

        No10179().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
