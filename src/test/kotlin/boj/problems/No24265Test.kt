package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No24265Test : StringSpec({
    "알고리즘 수업 - 알고리즘의 수행 시간 4 : https://www.acmicpc.net/problem/24265" {
        val given = "7"
        val expected = """
            21
            2
        """.trimIndent()

        val actual = No24265().solve(given.reader().buffered())

        actual shouldBe expected
    }
})
