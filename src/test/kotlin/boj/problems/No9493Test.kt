package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9493Test : StringSpec({
    "길면 기차, 기차는 빨라, 빠른 것은 비행기 : https://www.acmicpc.net/problem/9493" {
        val given = """
            21 70 80
            26 65 80
            0 0 0
        """.trimIndent()
        val expected = """
            0:02:15
            0:04:30
        """.trimIndent()

        No9493().solve(given.reader().buffered()) shouldBe expected
    }
})
