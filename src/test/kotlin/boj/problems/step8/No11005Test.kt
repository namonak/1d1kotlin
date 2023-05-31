package boj.problems.step8

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11005Test : StringSpec({
    "진법 변환 2 : https://www.acmicpc.net/problem/11005" {
        // given
        val input = "60466175 36"
        val expected = "ZZZZZ"

        // when
        val actual = No11005.solve(input)

        // then
        actual shouldBe expected
    }
})
