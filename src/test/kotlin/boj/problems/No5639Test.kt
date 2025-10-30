package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5639Test : StringSpec({
    "이진 검색 트리 : https://www.acmicpc.net/problem/5639" {
        val given = """
            50
            30
            24
            5
            28
            45
            98
            52
            60
        """.trimIndent()
        val expected = """
            5
            28
            24
            45
            30
            60
            52
            98
            50
        """.trimIndent()

        val actual = No5639().solve(given.reader().buffered())
        actual shouldBe expected
    }
})
