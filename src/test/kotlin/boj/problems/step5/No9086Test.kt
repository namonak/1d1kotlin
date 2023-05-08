package boj.problems.step5

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.InputStreamReader

class No9086Test : StringSpec({
    "문자열 : https://www.acmicpc.net/problem/9086" {
        // given
        val given = "3\n" +
            "ACDKJFOWIEGHE\n" +
            "O\n" +
            "AB"

        // when
        val actual = No9086.solve(BufferedReader(InputStreamReader(given.byteInputStream())))

        // then
        actual shouldBe "AE\nOO\nAB"
    }
})
