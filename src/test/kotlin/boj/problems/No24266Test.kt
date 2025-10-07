package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No24266Test : StringSpec({
    "알고리즘 수업 - 알고리즘의 수행 시간 5 : https://www.acmicpc.net/problem/24266" {
        val given = "7"
        val expected = """
            343
            3
        """.trimIndent()

        val actual = No24266().solve(given.reader().buffered())

        actual shouldBe expected
    }
})
