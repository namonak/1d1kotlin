package boj.problems.step8

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No2745Test : StringSpec({
    "진법 변환 : https://www.acmicpc.net/problem/2745" {
        // given
        val input = "ZZZZZ 36"
        val expected = 60466175

        // when
        val actual = No2745.solve(BufferedReader(StringReader(input)))

        // then
        actual shouldBe expected
    }
})
