package boj.problems.step14

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11478Test : StringSpec({
    "서로 다른 부분 문자열의 개수 : https://www.acmicpc.net/problem/11478" {
        // given
        val input = "ababc"
        val output = 12

        // when
        val actual = No11478.solve(input)

        // then
        actual shouldBe output
    }
})
