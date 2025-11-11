package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10599Test : StringSpec({
    "페르시아의 왕들 : https://www.acmicpc.net/problem/10599" {
        val given = """
            100 110 180 185
            -600 -575 -530 -530
            -25 10 72 86
            0 0 0 0
        """.trimIndent()
        val expected = """
            70 85
            45 70
            62 111
        """.trimIndent()

        No10599().solve(given.reader().buffered()) shouldBe expected
    }
})
