package boj.problems.step14

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No1269Test : StringSpec({
    "대칭 차집합 : https://www.acmicpc.net/problem/1269" {
        // given
        val input = """
            3 5
            1 2 4
            2 3 4 5 6
        """.trimIndent()
        val expected = 4

        // when
        val actual = No1269.solve(BufferedReader(StringReader(input)))

        // then
        actual shouldBe expected
    }
})
