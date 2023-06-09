package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2744Test : StringSpec({
    "대소문자 바꾸기 : https://www.acmicpc.net/problem/2744" {
        // given
        val input = "WrongAnswer"
        val expected = "wRONGaNSWER"

        val actual = No2744.solve(input)

        actual shouldBe expected
    }
})
