package boj.problems.step9

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No9506Test : StringSpec({
    "약수들의 합 : https://www.acmicpc.net/problem/9506" {
        // given
        val given = """
            6
            12
            28
            -1
        """.trimIndent()
        val expected = """
            6 = 1 + 2 + 3
            12 is NOT perfect.
            28 = 1 + 2 + 4 + 7 + 14
        """.trimIndent()

        // when
        val actual = No9506.solve(BufferedReader(StringReader(given)))

        // then
        actual shouldBe expected
    }
})
