package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2440Test : StringSpec({
    "별 찍기 - 3: https://www.acmicpc.net/problem/2440" {
        val given = "5"
        val expected = """
            *****
            ****
            ***
            **
            *
        """.trimIndent()

        No2440().solve(given.reader().buffered()) shouldBe expected
    }
})
