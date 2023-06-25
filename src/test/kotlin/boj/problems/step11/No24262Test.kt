package boj.problems.step11

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No24262Test : StringSpec({
    "알고리즘 수업 - 알고리즘의 수행 시간 1 : https://www.acmicpc.net/problem/24262" {
        val given = 1
        val expected = """
            1
            0
        """.trimIndent()

        val actual = No24262.solve(given)

        actual shouldBe expected
    }
})
