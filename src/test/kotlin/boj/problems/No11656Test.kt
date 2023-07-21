package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11656Test : StringSpec({
    "접미사 배열 : https://www.acmicpc.net/problem/11656" {
        val given = """
            baekjoon
        """.trimIndent()
        val expected = """
            aekjoon
            baekjoon
            ekjoon
            joon
            kjoon
            n
            on
            oon
        """.trimIndent()

        val actual = No11656.solve(given)

        actual shouldBe expected
    }
})
