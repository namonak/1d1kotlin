package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2592Test : StringSpec({
    "대표값 : https://www.acmicpc.net/problem/2592" {
        val given = """
            10
            40
            30
            60
            30
            20
            60
            30
            40
            50
        """.trimIndent()
        val expected = """
            37
            30
        """.trimIndent()

        No2592().solve(given.reader().buffered()) shouldBe expected
    }
})
