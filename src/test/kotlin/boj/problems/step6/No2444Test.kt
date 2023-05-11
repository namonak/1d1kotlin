package boj.problems.step6

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2444Test : StringSpec({
    "별 찍기 - 7 : https://www.acmicpc.net/problem/2444" {
        // given
        val n = 5
        val expected = """
            |    *
            |   ***
            |  *****
            | *******
            |*********
            | *******
            |  *****
            |   ***
            |    *
        """.trimMargin()

        // when
        val actual = No2444.solve(n)

        // then
        actual shouldBe expected
    }
})
