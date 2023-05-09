package boj.problems.step13

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.InputStreamReader

class No2587Test : StringSpec({
    "대표값2 : https://www.acmicpc.net/problem/2587" {
        // given
        val given = "10\n" +
            "40\n" +
            "30\n" +
            "60\n" +
            "30"
        val expected = "34\n30"

        // when
        val actual = No2587.solve(BufferedReader(InputStreamReader(given.byteInputStream())))

        // then
        actual shouldBe expected
    }
})
