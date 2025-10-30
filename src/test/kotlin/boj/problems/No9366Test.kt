package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9366Test : StringSpec({
    "삼각형 분류 : https://www.acmicpc.net/problem/9366" {
        val given = """
            2
            3 3 4
            6 4 2
        """.trimIndent()
        val expected = """
            Case #1: isosceles
            Case #2: invalid!
        """.trimIndent()

        No9366().solve(given.reader().buffered()) shouldBe expected
    }
})
