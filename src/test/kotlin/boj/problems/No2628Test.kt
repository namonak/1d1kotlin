package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2628Test : StringSpec({
    "종이자르기 : https://www.acmicpc.net/problem/2628" {
        val given = """
            10 8
            3
            0 3
            1 4
            0 2
        """.trimIndent()
        val expected = "30"

        No2628().solve(given.reader().buffered()) shouldBe expected
    }
})
